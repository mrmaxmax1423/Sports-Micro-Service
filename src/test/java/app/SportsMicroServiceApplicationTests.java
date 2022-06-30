package app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SportsMicroServiceApplicationTests {

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


