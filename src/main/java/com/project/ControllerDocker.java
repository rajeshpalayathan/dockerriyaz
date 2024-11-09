package com.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDocker {
	@GetMapping(value="/get")
	public String get() {
		return "Rajesh";
	}

}
