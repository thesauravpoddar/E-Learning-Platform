package com.tasks.springdemo3;

import com.tasks.springdemo3.models.Author;
import com.tasks.springdemo3.models.Video;
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
         /* var author = Author.builder()
                  .firstName("saurav")
                  .lastName("poddar")
                  .age(20)
                  .email("wehfyu@gmail.com")
                  .build();
          repository.save(author);*/
            var video = Video.builder()
                    .name("abs")
                    .length(6)
                    .build();
            videoRepository.save(video);
        };
    }

}
