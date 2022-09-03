package test.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DockerTestApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(DockerTestApplication.class.getName());
		logger.info("Main method executed=====================================>>>>>");
		SpringApplication.run(DockerTestApplication.class, args);

	}

}
