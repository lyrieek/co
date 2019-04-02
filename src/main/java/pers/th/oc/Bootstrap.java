package pers.th.oc;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.th.oc.mapper.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Bootstrap {

	private static SqlSessionFactory factory;
	private static final Properties properties = new Properties();
//	static {
//		try {
//			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
//		System.out.println("oc start");
		config(args[0]);
		SqlSession sqlSession = factory.openSession(true);
		ObjectMapper mapper = sqlSession.getMapper(ObjectMapper.class);
		for (Map obj : mapper.findByOwner(properties.get("jdbc.username").toString())) {
			System.out.println(obj.get("TABLE_NAME"));
		}
//		UserIDMapper userIDMapper = sqlSession.getMapper(UserIDMapper.class);
//		for (UserID item : userIDMapper.findAll()) {
//			System.out.println(item);
//		}
	}

	public static void config(String path) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(path);
			properties.load(inputStream);
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"), properties);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
