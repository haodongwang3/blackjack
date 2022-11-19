package blackJack_HaodongWang;
import java.util.*;
import java.io.*;

public class Dealer extends Player{
	private ArrayList<String> jokes = new ArrayList<String>();
	public Dealer(String name) {
		super(name);
	}
	
	public void loadJokes() throws Exception {
		File jokeFile = new File("C:\\VPCI\\GR 10\\ICS3U7_Sem1\\november_2022\\blackjakc\\playerJokes.txt");
		Scanner sc = new Scanner(jokeFile);
		while (sc.hasNextLine()) {
			jokes.add(sc.nextLine());
		}
		sc.close();
	}
	
	/* include polymorphism for jokes for if dealer wins
	*
	*
	*
	*/
	
	
}
