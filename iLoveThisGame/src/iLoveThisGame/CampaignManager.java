package iLoveThisGame;

public class CampaignManager extends Games implements Campaign{
	Games game;
	
		public CampaignManager(Games game) {
		super();
		this.game = game;
	}

		@Override
	public void add() {
		
		System.out.println(game.gameName+ "için kampanya eklenmiþtir");
		
	}

	@Override
	public void delete() {
		System.out.println(game.gameName+ "için kampanya kaldýrýlmýþtýr");
		
	}

	@Override
	public void update() {
		System.out.println(game.gameName+ "için kampanya güncellenmiþtir");
		
	}
	
		
	
}
