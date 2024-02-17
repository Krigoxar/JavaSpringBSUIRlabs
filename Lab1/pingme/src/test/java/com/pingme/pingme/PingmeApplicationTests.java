package com.pingme.pingme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pingme.pingme.dtos.UrlDTO;
import com.pingme.pingme.services.PingService;

@SpringBootTest
class PingmeApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(false, PingService.pingExternalServer(new UrlDTO("dsasdadsads")).IsResponding());
	}

}
