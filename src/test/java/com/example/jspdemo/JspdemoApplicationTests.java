package com.example.jspdemo;

import com.example.jspdemo.config.JavaConfig;
import com.example.jspdemo.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class JspdemoApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee.toString());
    }

}
