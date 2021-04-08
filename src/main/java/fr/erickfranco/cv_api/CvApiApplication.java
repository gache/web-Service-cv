package fr.erickfranco.cv_api;

import fr.erickfranco.cv_api.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource(value = "classpath:application.properties"),
        @PropertySource(value = "classpath:datasource.properties", ignoreResourceNotFound = true) })
public class CvApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvApiApplication.class, args);

        User user = new User();
        user.setUsername("erick");
        user.setPassword("1234");
    }

}
