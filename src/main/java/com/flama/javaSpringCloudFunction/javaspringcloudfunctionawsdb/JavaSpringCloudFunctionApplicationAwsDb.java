package com.flama.javaSpringCloudFunction.javaspringcloudfunctionawsdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
@ConfigurationPropertiesScan({ "com.flama.javaSpringCloudFunction.config" })
public class JavaSpringCloudFunctionApplicationAwsDb {

	private static final Logger log = LoggerFactory.getLogger(JavaSpringCloudFunctionApplicationAwsDb.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringCloudFunctionApplicationAwsDb.class, args);
	}

	@Bean
	public Function<Map, Map> hello(){
		return input -> {
			log.info("hello with input: {}", input);
			Map output = new HashMap();
			output.put("greeting", "Hello " + input.get("name") + " from a map");
			return output;
		};
	}

}
