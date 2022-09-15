package com.example.mongocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongocrud.model.Player;
import com.example.mongocrud.service.playerservice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("players")
public class playercontroller {

	@Autowired
	playerservice playerservice;
	
	@PostMapping
	public ResponseEntity<Player> saveplayer(@RequestBody Player player)
	{
		Player saveplayer = playerservice.saveplayer(player);
		return new ResponseEntity<Player>(saveplayer,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Player>>  getplayerss()
	{
		List<Player> getplayer = playerservice.getplayers();
		  return new ResponseEntity<List<Player>>(getplayer,HttpStatus.OK);
	}
	
	
	@GetMapping("id/{id}")
	public ResponseEntity<Object> getbyid(@PathVariable int id)
	{
		Player getplyid = playerservice.findById(id);
			return new ResponseEntity<Object>(getplyid,HttpStatus.OK);
 
	}
	
	@GetMapping("allid/{id}")
	public ResponseEntity<Object> getplayersbyid(@PathVariable int id)
	{
		List<Player> allplayers = playerservice.findAllById(id);
		if(allplayers.size()!=0)
		{
			return new ResponseEntity<Object>(allplayers,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("team/{team}")
	public ResponseEntity<Object> getallbyteam(@PathVariable String team)
	{
		List<Player> allbyteam = playerservice.findAllByteam(team);
		if(allbyteam.size()!=0)
		{
			return new ResponseEntity<Object>(allbyteam,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Object>("Data Not Found ",HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> deletebyid(@PathVariable int id)
	{
		String delplayer = playerservice.deletePlayer(id);
		return new ResponseEntity<Object>(delplayer,HttpStatus.OK);
	}
}
