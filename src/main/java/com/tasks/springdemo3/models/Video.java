package com.tasks.springdemo3.models;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@PrimaryKeyJoinColumn(name = "video_id") // to give special name to an entity that will be shown in database table
//@DiscriminatorValue("V")
public class Video extends Resources{
    private int length;
}
