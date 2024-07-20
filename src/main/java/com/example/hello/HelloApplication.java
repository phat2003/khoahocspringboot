package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {//class này là điểm đầu vào của springboot được cấu hình bằng @SpringBootApplication

	public static void main(String[] args) {//
		SpringApplication.run(HelloApplication.class, args);//SpringApplication.run là mặc định đã có, bên trong nó truyền vào file application class, và args(các tham số của file application class.
	}

}
