package com.tasks.springdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemo3Application.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(
        AuthorRepository repository
    ) {
        return args -> {
          var author = Author.builder()
                  .firstName("saurav")
                  .lastName("poddar")
                  .age(20)
                  .email("wehfyu@gmail.com")
                  .build();
          repository.save(author);
        };
    }*/

}
