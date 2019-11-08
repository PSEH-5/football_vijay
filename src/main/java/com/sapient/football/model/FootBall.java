package com.sapient.football.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FootBall {
	@JsonProperty("country_name")
    private String countryId;
	
	@JsonProperty("league_id")
    private String leagueId;
	
	@JsonProperty("league_name")
    private String leagueName;
	
	@JsonProperty("team_name")
    private String teamName;
	
	@JsonProperty("team_id")
    private String teamId;
	
	@JsonProperty("overall_league_position")
    private String overallLeaguePosition;


    public String getCountryId() {
		return countryId;
	}


	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}


	public String getLeagueId() {
		return leagueId;
	}



	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}



	public String getTeamId() {
		return teamId;
	}



	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}



	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}



	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}




	
	
}
