package iLoveThisGame;

public class CampaignManager extends Games implements Campaign{
	Games game;
	
		public CampaignManager(Games game) {
		super();
		this.game = game;
	}

		@Override
	public void add() {
		
		System.out.println(game.gameName+ "i�in kampanya eklenmi�tir");
		
	}

	@Override
	public void delete() {
		System.out.println(game.gameName+ "i�in kampanya kald�r�lm��t�r");
		
	}

	@Override
	public void update() {
		System.out.println(game.gameName+ "i�in kampanya g�ncellenmi�tir");
		
	}
	
		
	
}
