package jordanrowland.fakebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages="jordanrowland.fakebook.repository")
@EntityScan(basePackages = "jordanrowland.fakebook.model")
public class FakebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakebookApplication.class, args);
	}

}
