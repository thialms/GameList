package com.dev.gamelist.services;

import com.dev.gamelist.dto.GameMinDTO;
import com.dev.gamelist.entities.Game;
import com.dev.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream()
                .map(GameMinDTO::new)
                .toList();
    }

}
