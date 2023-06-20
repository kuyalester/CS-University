/**
 * The class for the Player object.
 * @see Main
 *
 */
public class Player {

	private String name;	//The name of the player
	private double score = 0;	//The score of the player
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * A setter method for the name of the player.
	 * @param string string to be the value of the name of the player.
	 */
	public void setPlayerName(String string) {
		name = string;
	}
	
	/**
	 * A getter method for the name of the player.
	 * @return the name of the player.
	 */
	public String getPlayerName() {
		return name;
	}
	
	/**
	 * Adds a score the the current score of the player.
	 * @param num the score to be added to the current score of the player.
	 */
	public void addPlayerScore(int num) {
		score = score + num;
	}
	
	/**
	 * a setter method for the score of the player
	 * @param num the value of the new score of the player
	 */
	public void setPlayerScore(int num) {
		score = num;
	}
	
	/**
	 * A getter method for the score of the player.
	 * @return the score of the player.
	 */
	public double getPlayerScore() {
		return score;
	}
	

}
