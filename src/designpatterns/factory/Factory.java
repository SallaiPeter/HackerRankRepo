package designpatterns.factory;

public class Factory {

	public static void main(String[] args) {
		
		FootballPlayer[] team = new FootballPlayer[4];
		
		team[0] = PlayerFactory.getPlayer("GoalKeeper");
		team[1] = PlayerFactory.getPlayer("Defender");
		team[2] = PlayerFactory.getPlayer("Midfielder");
		team[3] = PlayerFactory.getPlayer("Attacker");
		
		for(FootballPlayer p : team)
			p.run();
	}
}
