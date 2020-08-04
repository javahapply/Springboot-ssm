package com.Util;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	@Scheduled(fixedRate=1000)
	public void reportCurrent() {
		
		System.out.println(new Date());
	}
}
