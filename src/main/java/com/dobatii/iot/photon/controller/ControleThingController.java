package com.dobatii.iot.photon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Dobatii
 * @version 1.0
 *
 */

@Controller
public class ControleThingController {
	
	@GetMapping("show")
	public Mono<String> getStatus(){
		
		return Mono.just("index");
	}
}
