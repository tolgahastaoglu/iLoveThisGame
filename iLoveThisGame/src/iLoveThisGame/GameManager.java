package iLoveThisGame;

public class GameManager extends Games{
	
	public void addGame(Games game) {
		
		System.out.println(game.gameName + " adl� oyun eklenmi�tir, Fiyat�: " + game.gamePrice);
		
	}
	
	public void deleteGame(Games game) {
		System.out.println(game.gameName + " adl� oyun sistemden kald�r�lm��t�r");
	}

}
