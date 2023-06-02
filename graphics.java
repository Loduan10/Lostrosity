package pkg;
import java.util.*;
import java.io.*;
//use terminal graphics until learn to implement 
public class userInput() extends dictionary{
    Scanner sc = new Scanner(System.in);
    int lives = 6;
        
    Dictionary guessWord = new Dictionary;
    guessWord.constructWordArray();
    String[] realWord = guessWord.returnWordArray();
    Dictionary hiddenWord = new Dictionary;
    String[] astrikWord = hiddenWord.bufferWord();
    String guessedLetters = "";
    System.out.println("Hey there user, would you like to play a game of Hang Man? Let's test your skill.");
        while(lives != 0){
            
            System.out.println("You have " + lives + "attempts to try to guess the word");
            System.out.println(bufferWord));
            System.out.println("Which letter do you choose to guess?");
            
            while(!resp.contains(guessedLetters)){
                String resp = sc.nextLine();
                if(resp.contains(guessedWords)){
                    System.out.println("You already guessed that letter, please try again");
                }
            }
            guessedLetters = guessedLetters + resp;
            }
            for(int i = 0; i<realWord.length;i++){
                if((realWord[i].contains(resp))){
                    System.out.println("The word does contain this letter");
                    
            
                }
                if((!realWord.contains(resp))){
                    System,out.println("The word does not contain this letter");
                    lives--;
                    if(life == 5){
                        System.out.println("  _ _ _ ");
                        System.out.println("| .   . |");
                        System.out.println("|    o  |");
                        System.out.println("| _ _ _ |");
                        System.out.println("");
                    }
                    if(life == 4){
                        System.out.println("  _ _ _ ");
                        System.out.println("| .   . |");
                        System.out.println("|    o  |");
                        System.out.println("| _ _ _ |");
                        System.out.println("    |    ");
                        System.out.println("    |    ");
                        System.out.println("    |    ");
                        System.out.println("    |    ");
                        System.out.println("");
                    }
                    if(life == 3){
                        System.out.println("  _ _ _ ");
                        System.out.println("| .   . |");
                        System.out.println("|    o  |");
                        System.out.println("| _ _ _ |");
                        System.out.println("    | - - - |");
                        System.out.println("    |    ");
                        System.out.println("    |    ");
                        System.out.println("    |    ");
                        System.out.println("");
                    }
                    if(life == 2){
                        System.out.println("     _ _ _ ");
                        System.out.println("   | .   . |");
                        System.out.println("   |    o  |");
                        System.out.println("   | _ _ _ |");
                        System.out.println("|- - - | - - - |");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("");
                    }
                    if(life == 1){
                        System.out.println("     _ _ _ ");
                        System.out.println("   | .   . |");
                        System.out.println("   |    o  |");
                        System.out.println("   | _ _ _ |");
                        System.out.println("|- - - | - - - |");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("     _|");
                        System.out.println("");
                    }
                    if(life == 0){
                        System.out.println("     _ _ _ ");
                        System.out.println("   | x   x |");
                        System.out.println("   |    o  |");
                        System.out.println("   | _ _ _ |");
                        System.out.println("|- - - | - - - |");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("       |    ");
                        System.out.println("      | |");
                        System.out.println("      | |");
                        System.out.println("      | |");
                        System.out.println("     _| |_");
                        System.out.println("");
                    }
                }
            }
            
           
        }
    
    }
}
//if lives = certain number, then add certain body part(method since it's inherited)
    
     /* _ _ _
    | .   . |
    |    o  |
    | _ _ _ |
|- - -  | - - - |
        |    
        |
        |
       | |
       | |
       | |
      _| |_/*
   