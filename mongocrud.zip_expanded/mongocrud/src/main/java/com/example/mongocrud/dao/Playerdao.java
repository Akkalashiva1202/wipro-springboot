package com.example.mongocrud.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongocrud.model.Player;

public interface Playerdao extends MongoRepository<Player, Integer> {

	 public List<Player> findAllByPlayerId(int playerId);
	 public List<Player> findAllByteam(String team);
	// public Player deleteByPlayerId(int playerId);
}
