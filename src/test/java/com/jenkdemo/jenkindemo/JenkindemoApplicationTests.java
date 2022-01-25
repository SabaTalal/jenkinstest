package com.jenkdemo.jenkindemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class JenkindemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(JenkindemoApplication.checkIfInputIsAnEvenNumber(23)); // Assertion

	}

	// @Test
    //     public void testInputIsEven(){
    //         assertTrue(JenkindemoApplication.checkIfInputIsAnEvenNumber(23)); // Assertion
    //     }

}
