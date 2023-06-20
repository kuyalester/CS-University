import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

/**
 * A class for the Honors of the game.
 * @see Main
 *
 */
public class Honors {

	private Formatter read;
	private Scanner scan;
	private List<String> names = new ArrayList<String>();
	private List<String> scores = new ArrayList<String>();
	private List<Integer> intScores = new ArrayList<Integer>();
	
	/**
	 * creates a new Honor by reading calling the readHonorList method.
	 */
	public Honors() {
		readHonorList();
	}
	
	/**
	 * Reads the list of honors in the text file "honors.txt"
	 */
	public void readHonorList() {
		try {
			scan = new Scanner(new File("honors.txt"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		while(scan.hasNext()) {
			names.add(scan.next());
			scores.add(scan.next());
		}
		
		scan.close();
	}
	
	/**
	 * Updates the honor List in the text file "honors.txt"
	 * Compares the score of the player to the score of the past players
	 * and ranks him/her in the honor list.
	 * @param Name the name of the potential new player in the honor list.
	 * @param num the score of the player to be compared.
	 */
	public void updateHonorList(String Name, int num) {
		
		for(String score : scores) {
			intScores.add(Integer.parseInt(score));
		}
		
		if(intScores.get(6) < num) {
			intScores.set(6, num);
			Collections.sort(intScores, Collections.reverseOrder());
			
			int i = 0;
			for(Integer number : intScores) {
				scores.set(i, number.toString());
				i++;
			}
			names.remove(6);
			names.add(intScores.indexOf(num), Name);
		}
		
		try {
			read = new Formatter("honors.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		for(int i = 0; i < 7; i++) {
			read.format("%s %s\n", names.get(i), scores.get(i));
		}
	
		read.close();
		
	}
	
	/**
	 * A getter method for the names of the honors.
	 * @param num the index of the honor in the list(index = (honorRank) -1)
	 * @return the name of the player in the given index.
	 */
	public String getHonorNames(int num) {
		return names.get(num);
	}
	
	/**
	 * A getter method for the score of the honors.
	 * @param num the index of the honor in the list(index = (honorRank) -1)
	 * @return the score of the player in the given index.
	 */
	public String getHonorScores(int num) {
		return scores.get(num);	
	}
	
}
