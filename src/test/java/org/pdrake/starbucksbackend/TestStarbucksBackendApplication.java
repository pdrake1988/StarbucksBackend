package org.pdrake.starbucksbackend;

import org.springframework.boot.SpringApplication;

public class TestStarbucksBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(StarbucksBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
