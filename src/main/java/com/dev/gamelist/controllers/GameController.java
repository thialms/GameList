package com.dev.gamelist.controllers;

import com.dev.gamelist.dto.GameMinDTO;
import com.dev.gamelist.entities.Game;
import com.dev.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameMinDTO>> findAll(){
        return ResponseEntity.ok(gameService.findAll());
    }
}
