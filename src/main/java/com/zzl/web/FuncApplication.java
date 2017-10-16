package com.zzl.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.zzl.web.model.mapper")
@SpringBootApplication
@ServletComponentScan
public class FuncApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncApplication.class, args);
	}
}
