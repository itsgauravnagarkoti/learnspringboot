package com.gaurav;

public class Iplteams {
	
	String teamName;
	public Iplteams(String teamName, int trophies, String teamOwnerName, String teamCapitainName) {
		super();
		this.teamName = teamName;
		this.trophies = trophies;
		this.teamOwnerName = teamOwnerName;
		this.teamCapitainName = teamCapitainName;
	}
	int trophies;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	public String getTeamOwnerName() {
		return teamOwnerName;
	}
	public void setTeamOwnerName(String teamOwnerName) {
		this.teamOwnerName = teamOwnerName;
	}
	public String getTeamCapitainName() {
		return teamCapitainName;
	}
	public void setTeamCapitainName(String teamCapitainName) {
		this.teamCapitainName = teamCapitainName;
	}
	String teamOwnerName;
	String teamCapitainName;
	@Override
	public String toString() {
		return "Iplteams [teamName=" + teamName + ", trophies=" + trophies + ", teamOwnerName=" + teamOwnerName
				+ ", teamCapitainName=" + teamCapitainName + "]";
	}
	public Iplteams() {
		super();
		// TODO Auto-generated constructor stub
	}
}
