package com.flybird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flybird.utils.date.DateUtils;
import com.flybird.web.demo.repository.DemoRepository;

@SpringBootApplication
public class JwtDemoApplication {


    public static void main(String[] args) {
    	
        SpringApplication.run(JwtDemoApplication.class, args);
        //System.out.println(DateUtils.getCurrentDate());
    }
}
