package iLoveThisGame;

public class Sales extends Person implements Campaign {
	Person person;
	Games game;

	public Sales(Games game) {
		super();
		this.game = game;
	}

	public void sell(Person person) {
		
		System.out.println(person.playerName + " adl� ki�iye "+ game.gameName +" adl� oyun sat�ld�");
		
	}

	@Override
	public void add() {
		
		System.out.println(game.gameName + " adl� oyuna kampanya eklenmi�tir" );
		
	}

	@Override
	public void delete() {
		
		System.out.println(game.gameName + " adl� oyundan kampanya silinmi�tir" );
		
	}

	@Override
	public void update() {
		
		System.out.println(game.gameName + " adl� oyunda kampanya g�ncellenmi�tir" );
		
	}



}
