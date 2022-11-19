package blackJack_HaodongWang;
import java.util.*;

/*
 * Program Author : Haodong Wang
 * Creation Date  : 2022-11-16
 * Revision Date  : 2022-11-16
 * Course Code	  : ICS3U7-03
 * Teacher Name   : H.Strelkovska
 * Description    : BlackJack Program Assignment
 */

/*
 * What do I Want?
 * 
 * Money and betting
 * Multiple players
 * Players with personalities - joke types
 */
public class BlackJack {
	static Deck deck = new Deck();
	static int players = 0;
	static List<Player> playerList = new ArrayList<Player>();
	static int round = 1;
	
	public static void main(String[] args) throws Exception {
		String name = "";
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("How many players are there? [MAX 3]: ");
		players = sc.nextInt();
		while (players > 3) {
			System.out.println("Players must be less than or equal to 3.");
			players = sc.nextInt();
		}
		sc.nextLine();
		
		for (int i = 1; i<players+1;i++) {
			System.out.println("\nFor player "+ i+":");
			if (i==1) {
				System.out.print("\tWhat is your name? ");
			}
			else {
				System.out.print("\tWhat is their name? ");
			}
			name = sc.nextLine();
			Player player = new Player(name);
			playerList.add(player);
		}
		
		
		
		round();
		

			
		
	}
	public static void round() {
		//String hitStand = "";
		System.out.println("--------------------------------------------------");
		System.out.println("ROUND " + round +":");
		deck.initializeDeck();
		deck.shuffleDeck(deck.getDeck());
		
		Dealer dealer = new Dealer("Lotto");
		dealer.hit();
		dealer.hit();
		System.out.printf("%s %5s %8s","Dealer", ":",dealer.getCards());
		System.out.printf("%s,","\t[Sum: "+dealer.getSum()+"]");
		
		for (int i =0;i<players;i++) {
			playerList.get(i).hit();
			playerList.get(i).hit();
			System.out.printf("\n%s %8s %5s ", playerList.get(i).getName(),":",playerList.get(i).getCards());
			System.out.printf("%s,","\t[Sum: "+playerList.get(i).getSum()+"]");
		}	
	}
}
