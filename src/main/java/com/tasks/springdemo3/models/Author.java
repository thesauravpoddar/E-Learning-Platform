package com.tasks.springdemo3.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {

    @Id
    @GeneratedValue
           /* (
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )

    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )*/
    private Integer id;

    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    private String lastName;
    @Column (
            unique = true,
            nullable = false

    )
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<course> courses;

    private LocalDateTime createdAt;

    private LocalDateTime lastModified;



}
