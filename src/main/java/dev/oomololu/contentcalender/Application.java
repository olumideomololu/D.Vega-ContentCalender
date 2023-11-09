package dev.oomololu.contentcalender;

import dev.oomololu.contentcalender.config.ContentCalenderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
/*
	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			// insert data
			Content content = new Content(null,
					"My GPT blog post",
					"My GPT blog post",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");
			repository.save(content);
		};
	}
*/

