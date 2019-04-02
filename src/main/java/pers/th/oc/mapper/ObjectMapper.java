package pers.th.oc.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ObjectMapper {

	List<Map> findByTableName();

	List<Map> findByOwner(@Param("owner") String owner);

	List<Map> findAllTable();

}
