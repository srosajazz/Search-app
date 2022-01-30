package com.sergiorosa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.demo.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long> {

}
