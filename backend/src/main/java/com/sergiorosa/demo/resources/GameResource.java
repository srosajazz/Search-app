package com.sergiorosa.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiorosa.demo.dto.GameDTO;
import com.sergiorosa.demo.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
//	@Autowired
//	private GameRepository gameRepository;
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
