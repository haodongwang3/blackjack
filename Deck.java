package blackJack_HaodongWang;

public class Deck {
	
	private int deck[] = new int[52];
	//Start of deck creation
	public void initializeDeck() {
		for (int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
	}
	public void shuffleDeck(int[] arr) {
		/*	The method shuffle deck basically goes through every element in an array, and swaps it with another element
		 	located at a random position.*/
		int temp = 0;
		int randomizer = 0;
		for (int i=0;i<arr.length;i++) {
			randomizer = (int) (Math.random()*arr.length);
			temp = arr[randomizer];
			arr[randomizer] = arr[i];
			arr[i] = temp;
		}
	}

	public String toString(int num) {
		int suit = num/13;
		int value = num%13;
		String suitSymbol = "";
		String card = "";
		
		switch (suit) {
		case 0: 
			suitSymbol = "♥";
			break;
		case 1: 
			suitSymbol = "♦";
			break;
		case 2: 
			suitSymbol = "♣";
			break;
		case 3: 
			suitSymbol = "♠";;
			break;
		}

		switch (value) {
		case 0:
			card = "K";
			break;
		case 1:
			card = "A";
			break;
		case 2:
			card = "2";
			break;
		case 3:
			card = "3";
			break;
		case 4:
			card = "4";
			break;
		case 5:
			card = "5";
			break;
		case 6:
			card = "6";
			break;
		case 7:
			card = "7";
			break;
		case 8:
			card = "8";
			break;
		case 9:
			card = "9";
			break;
		case 10:
			card = "10";
			break;
		case 11:
			card = "J";
			break;
		case 12:
			card = "Q";
			break;
		}
;
		return card+suitSymbol;
	}
	
	public int getValue(int num) {
		//needs work to account for ACE
		if (num%13 == 0) {
			return 10;
		}
		else if (num%13 > 9 && num%13 < 13){
			return 10;
		}
		//else if (num%13 == 1) {
			// IMPLEMENT ACE CODE HERE
		//}
		else {
			return num%13;
		}	
		
		
	}

	public int getCard() {
		int card = deck[0];
		int[] newDeck = new int[deck.length - 1];
		for (int i = 1; i<deck.length;i++) {
			newDeck[i-1] = deck[i];
		}
		deck = newDeck;
		for (int i=0;i<deck.length;i++) {
			System.out.print(deck[i] + " ");
		}
		return card;
	}
}
