package univlo.tp.spring_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {
		GazettesStaticData.getInstance();
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

}
