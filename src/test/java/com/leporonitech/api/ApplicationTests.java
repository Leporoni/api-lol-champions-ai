package com.leporonitech.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "GEMINI_API_KEY=fake_api_key")
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
