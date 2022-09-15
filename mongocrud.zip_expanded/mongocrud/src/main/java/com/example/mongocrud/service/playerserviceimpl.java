package com.example.mongocrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongocrud.dao.Playerdao;
import com.example.mongocrud.model.Player;

@Service
public class playerserviceimpl implements playerservice {

	@Autowired
	Playerdao playerdao;
	
	@Override
	public Player saveplayer(Player player) {
		
		return playerdao.save(player);
	}

	@Override
	public List<Player> getplayers() {
		
		return  playerdao.findAll();
	}

	@Override
	public Player findById(int playerId) {
		
		 Optional<Player> byid = playerdao.findById(playerId);
		 if(byid.isPresent())
		 {
			 return  byid.get();
		 }
		 else
		 {
			 return null;
		 }
	}

	@Override
	public List<Player> findAllById(int playerId) {
		
		return playerdao.findAllByPlayerId(playerId);
	}

	@Override
	public List<Player> findAllByteam(String team) {
		
		return playerdao.findAllByteam(team);
	}

	@Override
	public String deletePlayer(int playerId) {
		 	
		Player delplayer = findById(playerId);
		if(delplayer !=null)
		{
			 playerdao.delete(delplayer);
			 return "player deleted";
		}
		else
		{
			return null;
		}
	}

  
	}

 

	

	
 