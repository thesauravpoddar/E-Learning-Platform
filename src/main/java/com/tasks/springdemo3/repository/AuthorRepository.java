package com.tasks.springdemo3.repository;

import com.tasks.springdemo3.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;


public interface AuthorRepository extends JpaRepository<Author , Integer> {
    // select * from author where first_name = ''
    List<Author> findAllByFirstName(String fn);


    List<Author> findAllByFirstNameIgnoreCase(String fn);

    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);


    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);


    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);


    List<Author> findAllByFirstNameInIgnoreCase(Collection<String> firstName);
}
