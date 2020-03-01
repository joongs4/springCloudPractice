package com.joongs.eureka;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//		new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
		new SpringApplicationBuilder(EurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}
