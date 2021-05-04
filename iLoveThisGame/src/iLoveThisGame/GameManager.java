package iLoveThisGame;

public class GameManager extends Games{
	
	public void addGame(Games game) {
		
		System.out.println(game.gameName + " adlý oyun eklenmiþtir, Fiyatý: " + game.gamePrice);
		
	}
	
	public void deleteGame(Games game) {
		System.out.println(game.gameName + " adlý oyun sistemden kaldýrýlmýþtýr");
	}

}
