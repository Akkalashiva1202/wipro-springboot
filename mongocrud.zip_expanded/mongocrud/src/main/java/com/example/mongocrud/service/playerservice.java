package com.example.mongocrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mongocrud.model.Player;

@Service
public interface playerservice {

	public Player saveplayer(Player player);
	public List<Player> getplayers();
	public Player findById(int playerId);
	public List<Player> findAllById(int playerId);
	 public List<Player> findAllByteam(String team);
	 public String deletePlayer(int playerId);
}
