package pe.edu.cibertec.Integrantes_frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegrantesFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrantesFrontendApplication.class, args);
	}

}
