package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimits()
	{
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
	
}
