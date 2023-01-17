package com.org.team.ipl.player_tests;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.org.team.base_functions.BaseTests;
import com.org.team.ipl.players.PlayersTypeCount;

import java.io.FileNotFoundException;


public class ValidatePlayersInIPLTeam extends BaseTests{

	@Test
	public void validateForeignPlayers() throws FileNotFoundException {
		
		PlayersTypeCount playersTypeCount= new PlayersTypeCount();
		int foreignPlayers= playersTypeCount.countForeignPlayers(buildRequestAndResponses());
		Assert.assertEquals(foreignPlayers, 4);
		
	}
	
	
	@Test
	public void validateWicketKeeper() throws FileNotFoundException{
		
		PlayersTypeCount playersTypeCount= new PlayersTypeCount();
		int wicketKeeprs= playersTypeCount.countWicketKeepersInTeam(buildRequestAndResponses());
		if (wicketKeeprs>0)
			Assert.assertTrue(true, "Team has Wicketkeeper(s)");
		else Assert.assertTrue(false, "Team has no Wicketkeeper");
	}
	
}
