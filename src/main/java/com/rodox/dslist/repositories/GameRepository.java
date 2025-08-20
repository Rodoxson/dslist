package com.rodox.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodox.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long>{

}
