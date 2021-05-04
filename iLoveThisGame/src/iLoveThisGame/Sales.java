package iLoveThisGame;

public class Sales extends Person implements Campaign {
	Person person;
	Games game;

	public Sales(Games game) {
		super();
		this.game = game;
	}

	public void sell(Person person) {
		
		System.out.println(person.playerName + " adlý kiþiye "+ game.gameName +" adlý oyun satýldý");
		
	}

	@Override
	public void add() {
		
		System.out.println(game.gameName + " adlý oyuna kampanya eklenmiþtir" );
		
	}

	@Override
	public void delete() {
		
		System.out.println(game.gameName + " adlý oyundan kampanya silinmiþtir" );
		
	}

	@Override
	public void update() {
		
		System.out.println(game.gameName + " adlý oyunda kampanya güncellenmiþtir" );
		
	}



}
