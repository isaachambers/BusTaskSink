package com.tasksink.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class BusTaskSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTaskSinkApplication.class, args);
	}

}
