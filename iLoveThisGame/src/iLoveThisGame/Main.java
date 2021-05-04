package iLoveThisGame;

public class Main {

	public static void main(String[] args) {
	  Player player=new Player();
	  player.id=1;
	  player.playerName="Tolga";
	  player.playerLastName="Hastaoðlu";
	  player.nationalId="123456";
	  
	  Games game= new Games();
	  game.gameName="Call of Duty";
	  game.gamePrice=100;
	  GameManager gameManager= new GameManager();
	  gameManager.addGame(game);
	  CampaignManager campaignManager=new CampaignManager(game);
	  campaignManager.delete();
	  
	  Sales sales=new Sales(game);
	  sales.sell(player);
	  sales.add();
	  
	 //// ikinci kiþi ve oyun için
	  
	  Player player2 =new Player();
	  player2.id=2;
	  player2.playerName="Ege";
	  player2.playerLastName="Hastaoðlu";
	  player2.nationalId="12345678";
		
	  Games game2= new Games();
	  game2.gameName="PES 2021";
	  game2.gamePrice=75;
	  GameManager gameManager2=new GameManager();
	  gameManager2.addGame(game2);
	  CampaignManager campaignManager2 =new CampaignManager(game2);
	  campaignManager2.add();
	  Sales sales2=new Sales(game);
	  sales2.sell(player2);
	  sales2.add();
	}

}
