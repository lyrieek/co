package pers.th.oc.mapper;

import org.apache.ibatis.annotations.Param;
import pers.th.oc.entity.UserID;

import java.util.List;

public interface UserIDMapper {

	List<UserID> findAll();

	List<UserID> findById(@Param("id") long id);

}
