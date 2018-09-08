package cn.carbs.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.carbs.backend", "cn.carbs.backend.exception"})
public class ApplicationCartoon {
    protected static final Logger logger = LoggerFactory.getLogger(ApplicationCartoon.class);

	public static void main(String[] args) {
        logger.info("SpringBoot开始加载 info");
        logger.debug("SpringBoot开始加载 debug");
		SpringApplication.run(ApplicationCartoon.class, args);
        logger.debug("SpringBoot开始加载222 debug");
        logger.info("SpringBoot开始加载222 info");
	}
}
