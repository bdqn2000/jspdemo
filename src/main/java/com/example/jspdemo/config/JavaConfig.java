package com.example.jspdemo.config;


import com.example.jspdemo.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/12/25.
 */
@Configuration
public class JavaConfig {

//    <bean id="employee" class="com.example.jspdemo.entity.Employee" init-method="">
//       <!-- 指定被赋值的属性名 -->
//       		<property name="userName">
//       		<!-- 赋值的内容 -->
//       			<value>小明</value>
//       		</property>
//       </bean>
    //定义员工类Bean组件
    //@Bean
    //@Scope("singleton")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Employee employee() {
        Employee employee = new Employee();
        employee.setUserName("小明");
        return employee;
    }



}
