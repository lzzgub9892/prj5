package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.woniu.mapper")
@ServletComponentScan("com.woniu.filter")
public class Prj14Application {

	public static void main(String[] args) {
		SpringApplication.run(Prj14Application.class, args);
	}

}
