package io.github.woukies.ex6_4;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:ex6_4/applicationCTX.xml")
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");

		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);

		return student;
	}
}
