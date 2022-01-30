package com.sergiorosa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.demo.entities.Genre;

public interface GenreRepository  extends JpaRepository<Genre, Long> {

}
