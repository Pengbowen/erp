package com.pbw.erp.mapper;

import com.pbw.erp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 使用注解方式使用mybatis
 */
@Repository
public interface UserMapper {

    @Select("select * from user where user_id = #{userId}")
    User selectUserByUserId(@Param("userId") int userId);
}
