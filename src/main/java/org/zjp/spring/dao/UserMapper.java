package org.zjp.spring.dao;

import org.apache.ibatis.annotations.Param;
import org.zjp.spring.bean.UserBean;

public interface UserMapper {
    UserBean getUser(@Param("name") String name, @Param("password")String password);
}
