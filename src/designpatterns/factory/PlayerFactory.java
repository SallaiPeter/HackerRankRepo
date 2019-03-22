package designpatterns.factory;

public class PlayerFactory {

	public static FootballPlayer getPlayer(String playerType) {
		if(playerType == null) 
			return null;
		
		switch (playerType) {
		case "Attacker":
			return new Attacker();
		case "Defender":
			return new Defender();
		case "Midfielder":
			return new Midfielder();
		case "GoalKeeper":
			return new GoalKeeper();
		}

		return null;
	}
}
