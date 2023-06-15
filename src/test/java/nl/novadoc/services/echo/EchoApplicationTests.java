package nl.novadoc.services.echo;

import nl.novadoc.services.echo.service.EchoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EchoApplicationTests {

	@Autowired
	EchoService service;

	@Test
	void contextLoads() {
	}

	@Test
	void testEchoService() {

		String message = service.getMessage("Jupiter testing");
		assertNotNull(message);


	}

}
