import java.util.Arrays;
import java.util.Scanner;
public class MultiplicationTable {
	
	// add a function that takes a multiplier and size and prints the array in the below format 
	// [...]
	
	
	/**
	 * A Function that return a multiplication table 
	 * @param multiplier
	 * @param size
	 * @return
	 */ int[] Multiply(int tableNum, int N){
		 
		 int[] tables = new int[N+1];
		 //String tabletext = "";
		 
		 
		 for(int i=1; i<=N; i++) {
			 tables[i] = tableNum*i; 
			  
		 }
		 
		/* for(int j=1; j< tables.length; j++)
		 { 
			 tabletext += tableNum + " X" + j + " =" + tables[j] + "\n";   
			 } */
		 
		 return tables;		 

	}
	/*Integer[] getTables(int multiplier,int size) {
		// declare the function array 
		Integer[] tables = new Integer[size];
		
		System.out.print("Add a For Loop Here ");
		
		// return the integer array
		return tables;
	} */
	
	public static void main(String args[]) {
		// Instantiate class MultiplicationTable
		MultiplicationTable mT = new MultiplicationTable();
		int[] var = mT.Multiply(12,11);

		System.out.print(Arrays.toString(var));
	
	}

}
