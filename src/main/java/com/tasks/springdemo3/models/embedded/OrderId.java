package com.tasks.springdemo3.models.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderId implements Serializable {

    @Column(unique = true)
    private String Username;

    private LocalDateTime OrderDate;
}
