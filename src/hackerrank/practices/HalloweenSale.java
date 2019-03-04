package hackerrank.practices;

public class HalloweenSale {

    static int howManyGames(int first, int discount, int minimum, int wallet) {
		if(wallet < first || first < 1)	return 0;
		
		int bought = 0;
		
		while(wallet >= minimum) {
			int nextbuy = Math.max(first - discount * bought, minimum);
			if(wallet - nextbuy >= 0) {
				wallet = wallet - nextbuy;
				bought++;
			} else {
				break;
			}
		}
	
		return bought;
    }
    
	public static void main(String[] args) {
		System.out.print(howManyGames(100, 19, 1, 180));

	}

}
