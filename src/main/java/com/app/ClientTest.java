package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

//@SpringBootApplication
@Configuration
@ComponentScan({"com.app.*"})
@EnableAutoConfiguration
public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(ClientTest.class, args);
	Employee emp=	context.getBean(Employee.class);
	emp.Display();

	}

}
