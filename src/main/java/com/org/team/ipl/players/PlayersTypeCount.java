package com.org.team.ipl.players;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class PlayersTypeCount {
	
	Response response;
	
	public int countForeignPlayers(Response response) {
		
		this.response= response;
        JsonPath jsonPath = response.jsonPath();
		int PlayerCount= jsonPath.getInt("player.size()");
		
		int foreignPlayerCount=0;
		for (int i=0; i<PlayerCount;i++) {
			 String j = jsonPath.getString("player["+i+"].country");
			 if(!j.equals("India"))
			 foreignPlayerCount++;	 
		}
		System.out.println("Count of Foreign players in the team is:" +foreignPlayerCount);
		return foreignPlayerCount;
	}
	
	
	public int countWicketKeepersInTeam(Response response) {
		
		this.response= response;
		
        JsonPath jsonPath = response.jsonPath();
		int PlayerCount= jsonPath.getInt("player.size()");
		
		int counticketKeeper=0;
		for (int i=0; i<PlayerCount;i++) {
			 String j = jsonPath.getString("player["+i+"].role");
			 if(j.equals("Wicket-keeper"))
				 counticketKeeper++;	 
		}
		
		System.out.println("Count of Wicket keepers in the team is:" +counticketKeeper);
		return counticketKeeper;
	}

}
