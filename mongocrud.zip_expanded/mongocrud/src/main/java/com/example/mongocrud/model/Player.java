package com.example.mongocrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Player {

	@Id
	int playerId;
	String playerName;
	String team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playerName, String team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.team = team;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", team=" + team + "]";
	}
	
}
