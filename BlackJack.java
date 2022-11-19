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
	
	public static void main(String[] args) throws Exception {
		String name = "";
		Scanner sc = new Scanner(System.in);		
		System.out.print("How many players are there? [MAX 3]: ");
		players = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i<players+1;i++) {
			System.out.println("\nFor player "+ i+":");
			System.out.print("\tWhat is their name? ");
			name = sc.nextLine();
			Player player = new Player(name);
			playerList.add(player);
		}
		round();

			
		
	}
	public static void round() {
		int round = 1;
		//String hitStand = "";
		System.out.println("--------------------------------------------------");
		System.out.println("ROUND " + round +":");
		deck.initializeDeck();
		
		for (int i =0;i<players;i++) {
			playerList.get(i).hit();
			System.out.println(playerList.get(i).getCards());
		}	
	}
}
