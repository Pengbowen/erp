package com.pbw.erp.service;

import com.pbw.erp.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {

    User selectUserByUserId(@Param("userId") int userId);
}
