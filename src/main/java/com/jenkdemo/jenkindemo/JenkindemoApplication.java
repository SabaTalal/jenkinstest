package com.jenkdemo.jenkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkindemoApplication {

	public static void main(String[] args) {
		System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
		SpringApplication.run(JenkindemoApplication.class, args);

	}

	public static boolean checkIfInputIsAnEvenNumber(int number){
		return number % 2 == 0;
	}

}
