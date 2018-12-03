/* Barak Stout
 * 
 *
 * ***** YOU SHOULD NOT MODIFY ANYTHING IN THIS PROGRAM  ***** 
 *
 */

public interface Hangman {

	//Returns all words in database, seprated by comma
	public String getDatabase();
	
	//Add words, separated by commas to database
	public void buildDB(String words);
	
	//Set word to a random word from database
	public void pickWord();
	
	//Return true if letter l is in word
	public boolean checkLetter(String l);
	
	//Convert word to blanks
	public void setBlanks();
	
	//Get Blanks
	public String getBlanks();
	
	//Update blank word 
	public void updateBlankWord(String l);
	
}
