package com.gustavokoichi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavokoichi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
