package com.wisdontech.wisdondemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.wisdontech.wisdondemo.dao")
public class WisdondemoBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(WisdondemoBizApplication.class, args);
	}
}
