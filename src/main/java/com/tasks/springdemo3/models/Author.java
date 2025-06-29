package com.tasks.springdemo3.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity{

           /* (
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )

    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )*/

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
    private List<Course> courses;



}
