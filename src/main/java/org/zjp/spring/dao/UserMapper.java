package org.zjp.spring.dao;

import org.zjp.spring.bean.UserBean;

public interface UserMapper {
    UserBean getUser(String name, String password);
}
