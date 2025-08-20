package com.rodox.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodox.dslist.dto.GameDto;
import com.rodox.dslist.dto.GameMinDto;
import com.rodox.dslist.entities.Game;
import com.rodox.dslist.repositories.GameRepository;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly= true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }
    @Transactional(readOnly= true)
    public List<GameMinDto> findAll() {
        
       List<Game> result = gameRepository.findAll();
       List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
       return dto;

        
    }

}
