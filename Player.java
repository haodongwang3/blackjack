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
	
	public void loadJokes() throws Exception {
		File jokeFile = new File("C:\\VPCI\\GR 10\\ICS3U7_Sem1\\november_2022\\blackjakc\\playerJokes.txt");
		Scanner sc = new Scanner(jokeFile);
		while (sc.hasNextLine()) {
			jokes.add(sc.nextLine());
		}
		sc.close();
	}
	
	public String nextJoke() {
		String joke = jokes.get(0);
		jokes.remove(0);
		return joke;
	}
	
	public void hit() {
		this.cards.add(deck.toString(deck.getCard()));
	}
	
	
}
