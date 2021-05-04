package iLoveThisGame;

public class Player extends Person{

public int yearOfBirth;
public String nationalId;

 public Player() {
	
}

 public Player(int id, String playerName, String playerLastName,int yearOfBirth,String nationalId ) {
		this.id=id;
		this.nationalId=nationalId;
		this.playerName=playerLastName;
		this.playerLastName=playerLastName;
		this.yearOfBirth=yearOfBirth;
 }

}
