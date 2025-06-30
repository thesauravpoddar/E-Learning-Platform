package com.tasks.springdemo3.repository;

import com.tasks.springdemo3.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
