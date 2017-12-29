package com.soda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@ComponentScan("com.soda.*")
@MapperScan("com.soda.dao")
public class SampleController {

   /* @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}