import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SequenceGenerator {
	
	private int n;
	
	public ArrayList <Integer> getArrayList() {
		
		return arrayList;
	}
	//Create an array list, that is Random. Much of code in this class was adopted from online instruction from the instructor Mr. Tim Fox
	private ArrayList <Integer> arrayList = new ArrayList<>();
		
	public SequenceGenerator (int n) { 
		this.n = n;
	}
	
	public ArrayList <Integer> GenerateSequence (){
		arrayList.clear();
		
		for (int i =0; i <n; i++) {
			
			arrayList.add(ThreadLocalRandom.current().nextInt(0, n+1));
		}
		
		return this.arrayList;
		}
 		
		
}