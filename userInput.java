package pkg;
import java.util.*;
import java.io.*;
// Import all text from a dictionary
// Make each word in the dictionary an index inside of an arraylist
// Make it randomly select one word with Math.Random() from one of the indexes
// Use scanner to ask the player if they'd like to play, otherwise end game and restart
// Make loop to ask user for a lettrt
// -If word contains letter, convert "_" to revealed letter(user input)
// -Else subtract from counter until word is completed or counter condition is met 
// End game for both of these conditions and ask if user would like to play again(Repeat previous steps)
class starter {
    public class userInput() extends Dictionary{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lives = 6;
        
        guessWord.getWord();

        System.out.println("Hey there user, would you like to play a game of Hang Man? Let's test your skill");
        System.out.println("You have 6 attempts to try to guess the word");
        while(lives != 0){
        System.out.println("What letter do you guess first?");
        bufferword(); // need to make loop to always print out and change once letter is guessed( the buffer and actWord arrays)
        String resp = sc.nextLine();
        if((guessWord.contains(resp1))){
            System.out.println("The word does contain this letter");
            
        }
        }
    
    }
}