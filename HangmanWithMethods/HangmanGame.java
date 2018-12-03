// Name: 

// You will need to modify most the functions in this code. Follow the TODOs... 

// When you are done, zip & email to Mr. Stout

public class HangmanGame implements Hangman {

   // DO NOT TOUCH	
	private String[] db; // Array with words to play. 
	private String word; // The secret word the player is trying to guess
	private String blanks; // The blanks (or half filled) word that we display to the user

   // This is the main driver. There is some startup code already here. 
   // TODO: Modify the program slightly. 
	public static void main(String[] args) {
		HangmanGame hg = new HangmanGame();
		hg.buildDB("hello, world");
		hg.pickWord();
      hg.updateBlankWord("h");
      System.out.println(hg.getBlanks());
	}
	
    // DO NOT TOUCH
	public HangmanGame()
	{
		buildDB("");
      blanks = word = "";
	}

   // TODO: Fill the method such that the DB is returned with a comma (,) seprating each word
	@Override
	public String getDatabase() {
		return "";
	}

   // TODO: Store all the comma seprated words passed in via words in the DB
	@Override
	public void buildDB(String words) {

	}

   // TODO: Return a randomly selected word from the DB
	@Override
	public void pickWord() {
		
	}

   // TODO: Return true if the selected word contains the letter l
	@Override
	public boolean checkLetter(String l) {
		return false;
	}

   // TODO: Set the blanks variable to hold underscroes fro each letter in word
	@Override
	public void setBlanks() {
      
	}
	
   // TODO: Return the current blacks variable
	public String getBlanks() {
		return "";
	}

   // TODO: Update blanks to replace underscores with letter l, according to the letter position in word 
	@Override
	public void updateBlankWord(String l) {
     
	}

}
