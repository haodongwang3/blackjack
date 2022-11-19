package blackJack_HaodongWang;
import java.util.*;
import java.io.*;

public class Player extends BlackJack{
	private String name;
	private int sum = 0;
	private ArrayList<String> cards = new ArrayList<String>();
	private ArrayList<String> jokes = new ArrayList<String>();

	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public ArrayList<String> getCards() {
		return this.cards;
	}
	
	public void loadJokes(String fileName) {
		try {
			File jokeFile = new File(fileName);
			Scanner sc = new Scanner(jokeFile);
			while (sc.hasNextLine()) {
				jokes.add(sc.nextLine());
			}
			sc.close();
		}
		catch (Exception e){
			System.out.print("error");
		}
	}
	
	public String nextJoke() {
		String joke = jokes.get(0);
		jokes.remove(0);
		return joke;
	}
	
	public void hit() {
		int card = deck.getCard();
		this.cards.add(deck.toString(card));
		this.sum += deck.getValue(card);
	}
	
	
}
