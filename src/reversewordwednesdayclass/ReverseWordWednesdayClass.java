
package reversewordwednesdayclass;

import java.util.Scanner;

/**
 * A class to demo array concepts as a review
 * @author dancye, 2023
 */
public class ReverseWordWednesdayClass 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word, if yuo enter a plaindrome, it will look the same: ");
        String word = sc.nextLine();// take in the word and store it in a varaible
        char [] letters = new char[word.length()];
        for(int i=0; i<word.length() ;i++)
        {
            char c = word.charAt(i);
            letters[i] = c;//put the letter into the array
        }
        
        //reverse the letters as I print them out. Iterate over the array backwards
        //and print each letter
        for(int j=word.length()-1; j>=0; j--)
        {
          System.out.print(letters[j]);  
        }
    }
    
}
