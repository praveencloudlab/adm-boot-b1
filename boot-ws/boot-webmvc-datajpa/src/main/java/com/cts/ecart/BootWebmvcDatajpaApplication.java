package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class BootWebmvcDatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWebmvcDatajpaApplication.class, args);
	}

}
