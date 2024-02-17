package com.pingme.pingme.presentors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

import com.pingme.pingme.dtos.ExtServerRespond;
import com.pingme.pingme.dtos.UrlDTO;
import com.pingme.pingme.services.PingService;

@RestController
public class PingPresentor {

	@GetMapping("/ping")
	public ExtServerRespond ping(@RequestParam(value = "url") String url) throws IOException {
		try
		{
			return PingService.pingExternalServer(new UrlDTO(url));
			
		}
		catch(IOException e)
		{
			return new ExtServerRespond(false);
		}
	}
}