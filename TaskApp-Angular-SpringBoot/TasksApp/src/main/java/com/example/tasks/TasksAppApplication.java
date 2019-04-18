package com.example.tasks;

import com.example.tasks.domain.Task;
import com.example.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save(new Task(1L, "Create SpringBoot Application", LocalDate.now(), true));
			taskService.save(new Task(2L, "Create SpringBoot Project Packages", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
			taskService.save(new Task(3L, "Create SpringBoot services", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
			taskService.save(new Task(4L, "Create SpringBoot repository", LocalDate.now().plus(3, ChronoUnit.DAYS), true));
			taskService.save(new Task(5L, "Create SpringBoot controller", LocalDate.now().minus(1, ChronoUnit.DAYS), false));
			taskService.save(new Task(6L, "Run the SpringBoot Application", LocalDate.now().minus(2, ChronoUnit.DAYS), true));

		};
	}
}
