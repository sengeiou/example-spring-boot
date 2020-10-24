package com.lesson.boot.mvc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code StandardHostValve#throwable(org.apache.catalina.connector.Request, org.apache.catalina.connector.Response, java.lang.Throwable)}
 *
 * @author zhengshijun
 * @version created on 2018/11/23.
 */
@SpringBootApplication
public class BootMvcRestBootstrap {
	public static void main(String[] args) {


		SpringApplication.run(BootMvcRestBootstrap.class, args);
	}
}
