package com.face.player;

public class Team {

	Long teamId;
	String teamName;
	
	public Team(Long teamId,String teamName) {
		
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}
