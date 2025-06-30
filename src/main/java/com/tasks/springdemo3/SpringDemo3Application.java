package com.tasks.springdemo3;

import net.datafaker.Faker;
import com.tasks.springdemo3.models.Author;
import com.tasks.springdemo3.repository.AuthorRepository;
import com.tasks.springdemo3.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemo3Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
        AuthorRepository repository,
        VideoRepository videoRepository
    ) {
        return args -> {
            /*for (int i = 0; i < 50; i++) {
                Faker faker = new Faker();
                var author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .age(faker.number().numberBetween(19 , 50))
                        .email("wehfy" + i + "@gmail.com")
                        .build();
                repository.save(author);
            }*/

            /*var video = Video.builder()
                    .name("abs")
                    .length(6)
                    .build();
            videoRepository.save(video);*/
        };
    }

}
