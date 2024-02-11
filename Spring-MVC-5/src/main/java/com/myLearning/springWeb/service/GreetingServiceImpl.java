package com.myLearning.springWeb.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements IGreetingService {

	@Override
	public String generateGreeting() {
		
		LocalDateTime dateTime = LocalDateTime.now();
		int hours = dateTime.getHour();
		if (hours < 12)
			return "Good morning";
		else if (hours < 16)
			return "good afternoon!!";
		else if (hours < 20)
			return "good evening";
		else
			return "good night!!!";
	}
}
