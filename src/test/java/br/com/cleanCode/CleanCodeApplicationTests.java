package br.com.cleanCode;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CleanCodeApplication.class)
@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application.properties")
public class CleanCodeApplicationTests {

	@Test
	void contextLoads() {
	}

}
