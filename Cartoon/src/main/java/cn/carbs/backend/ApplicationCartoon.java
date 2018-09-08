package cn.carbs.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.carbs.backend", "cn.carbs.backend.exception"})
public class ApplicationCartoon {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationCartoon.class, args);
	}
}