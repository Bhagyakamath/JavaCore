package springmvcdemo.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {
	@Bean
	public StudentDao f1() throws Exception {
		return new StudentDao();
	}
}
