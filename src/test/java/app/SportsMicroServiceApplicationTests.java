package app;

import app.model.Player;
import app.service.IPlayerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
class SportsMicroServiceApplicationTests {

	@Autowired
	IPlayerService playerService;
	private Player player;
	@Test
	void contextLoads() {
	}

	@Test
	void fetchWinsLossesUpcomingGame(){
		givenBaseballButtonAvailable();
		givenFootballButtonAvailable();
		givenSoccerButtonAvailable();
		whenSearchTeamWin();
		whenSearchTeamLoss();
		whenSearchTeamUpcomingGame();
		thenReturnWin();
		thenReturnLoss();
		thenReturnUpcomingGame();
	}

	private void givenSoccerButtonAvailable() {
	}

	private void givenFootballButtonAvailable() {
		
	}

	private void givenBaseballButtonAvailable() {

	}

	private void whenSearchTeamUpcomingGame() {
	}

	private void whenSearchTeamLoss() {
		
	}

	private void whenSearchTeamWin() {
	}

	private void thenReturnLoss() {
	}

	private void thenReturnUpcomingGame() {
		
	}

	private void thenReturnWin() {
		
	}


}


