package com.soda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan("com.zheng*,com.soda.*")
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