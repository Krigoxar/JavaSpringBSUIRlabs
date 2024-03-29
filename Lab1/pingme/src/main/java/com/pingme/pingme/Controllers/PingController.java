package com.pingme.pingme.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pingme.pingme.dtos.ExtServerRespond;
import com.pingme.pingme.dtos.UrlDTO;
import com.pingme.pingme.services.PingService;

@RestController
public class PingController {

	@GetMapping("/ping")
	public ExtServerRespond ping(@RequestParam(value = "url") String url) {
		
			return PingService.pingExternalServer(new UrlDTO(url));
	}
}