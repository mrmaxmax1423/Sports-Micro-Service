package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
@Repository
@Component
public class SportsMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsMicroServiceApplication.class, args);
	}

}
