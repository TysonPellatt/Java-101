/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		String words [] = {"advance", "profit", "column", "flavor", "enlarge", "workshop", "pastel", "communication", "development", "side"};
		String word_chosen; //words chosen
		char input; //user input
		char guess_word[];
		int l = 5;
		//for(int i = 0;i < word.length;i++){
		 ///   word[]=system.console().readLine();
	//	}
	
	    //generate random word first
	    Random rand = new Random();// makes the new random machine which is an int
	    int int_random = rand.nextInt(words.length -1);//generate a random index and store it in int_random
	    word_chosen = words[int_random];//stores the chosen word at index int_random in word_chosen
	    System.out.println(word_chosen);// it prints out the word the computer chose
	    guess_word = new char[word_chosen.length()];//will store then characters of the words
	    for(int g = 0;g < word_chosen.length();g++) { //set each character as _ to start and will replace it with letter when guessed  
	        guess_word[g] = '_'; //sets default as _ and will replace with letter when guessed
	    }
	    
	    while (l != 0 && !String.valueOf(guess_word).equals(word_chosen)) { //runs while lives are not 0 and we havent guessed the word
	        System.out.println("\nPlease enter a letter to guess");
	        input = scan.next().charAt(0);
	        
	        
	        if (word_chosen.indexOf(input) != -1) { //if it contains the letter, then index is not -1
	            for (int i = 0; i < guess_word.length; i ++ ){
	                if (word_chosen.charAt(i) == input){//if it equals the word then change it
	                    guess_word[i] = input;
	                }
	            }
	            
	        }else {// if the letter isnt in the word it will say wrong letter
	            System.out.println("wrong letter");
	            l--; //this is same as l = l-1 
	        }
	        System.out.println("You have " + l + " lives left");
	        for(int i = 0;i < guess_word.length;i++){ //after the letter is guesed it changes the the _ to the lettter depending on the space it is in 
	            System.out.print(guess_word[i] + " ");
	        }
	    }
	    
	    
	}
}
