package com.gustavokoichi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavokoichi.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
