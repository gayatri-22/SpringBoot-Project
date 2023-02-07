package com.springrest.springrest;




import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
//
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
@Configuration
public class SpringrestApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		this.loadDao.createTable();
	}

	

}
