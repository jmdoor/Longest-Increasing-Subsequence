import java.util.Scanner;
import java.util.ArrayList;

public class LongestSequence {

	public static void main (String[] args) {
		
		
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter an array size, of size less than 100, please: ");
        int n = input.nextInt(); // size of array sent into class Sequence Generator 
        
        
        SequenceGenerator sg = new SequenceGenerator(n); 
        ArrayList <Integer> integerList = sg.GenerateSequence ();   
        
        System.out.println ("\nThe list in the array is: " + integerList); 
    
    	SequenceLocator sl = new SequenceLocator(integerList);
        
    	
    }

     
}