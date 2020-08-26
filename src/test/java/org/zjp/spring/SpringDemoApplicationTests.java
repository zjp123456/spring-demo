package org.zjp.spring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zjp.spring.bean.UserBean;
import org.zjp.spring.service.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringDemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void testLogin() {
        UserBean userBean = userService.loginIn("tom","root123");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
