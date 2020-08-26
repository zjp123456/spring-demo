package org.zjp.spring.service;


import org.zjp.spring.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
