import java.util.ArrayList;

public class SequenceLocator {
	
	/*private ArrayList <Integer> arrayList = new ArrayList<>();
	//identifies the longest sequence and the length of the sequence for the size of the array that the user chooses for the array 
	takes in array */

	public SequenceLocator (ArrayList <Integer> arrayList){ //pass arrayList
		
		//this.arrayList = arrayList;	
				
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();  
		int next = -1; //max value size
		int currentValue;
		
		
	    for(int i = 0; i < arrayList.size(); i++) { 
	    	 currentValue = arrayList.get(i);   //value iterated on array gets passed onto integer current       
		     
	    		    	/*iterates through array to find a subset of increasing values, once it reaches a spot where values are not increasing it stops storing in temp 
	    	and evaluates the rest of the array
	    	then compares size of arrays and outputs the longest subsequence that meets increasing criteria
	    	while only storing the elements of the first subset if it encounters another instance where subsets are of the same size */
	       
	        if(i + 1 < arrayList.size())next = arrayList.get(i + 1); //if position to right is less than array size get that value 
	        if(currentValue > next) { 
	            if(outputList.size() <= tempList.size()) {
	                tempList.add(currentValue); //add value to the temporary spot 
	                outputList = new ArrayList<Integer>(tempList); 
	            }
	            tempList.clear();  //clear the tempList  
	        } else 
	        {
	            tempList.add(currentValue); // puts values that meet condition 
	        }
	    }
	    System.out.println ("\nThe size of longest increasing subsequence of the array is " + outputList.size());
	    System.out.println ("\nThe subsequence is " + outputList);
			
		}
		
	}
