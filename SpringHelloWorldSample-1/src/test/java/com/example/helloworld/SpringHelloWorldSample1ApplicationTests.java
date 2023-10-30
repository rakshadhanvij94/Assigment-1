package com.example.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringHelloWorldSample1ApplicationTests {

	  @Autowired
	  private TestRestTemplate template;

	  @Test
	  public void helloWorldSuccess() throws Exception {
	      ResponseEntity<String> response = template.getForEntity("/helloWorld", String.class);
	      assertThat(response.getBody()).isEqualTo("Hello World!!");
	      System.out.println("Hello World test case passed");
	  }
	  
	  @Test
	  public void helloNameSuccess() throws Exception {
	      ResponseEntity<String> response = template.getForEntity("/helloName", String.class);
	      assertThat(response.getBody()).isEqualTo("Hello Yogesh!!");
	      System.out.println("Hello Name test case passed");
	  }

}
