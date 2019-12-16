/**
* Programs that implements arrays and loops using Functions.
*
* @author  spoorthy
* @version 1.0 
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class multab{

	/* Function for creating multiplication table*/
	public int[] multiplication(int tabNumber, int X) {

		int[] tables = new int[X];
		for(int i=0;i<X;i++) {
			tables[i] = (i+1)*tabNumber;
		}	
		return tables;
		
	}
	/* Function to create contents and length of the array*/
	public void tableInfo(int[] table) {
		//System.out.print("contents of the array: " + Arrays.toString(table) + "\n");
		for(int i=0;i<table.length;i++) {
			System.out.print("Position "+(i+1)+": " +table[i] + "\n");
		
		}
		System.out.print("length of the array : " + table.length + "\n");
	}
	/* Function and methods to print the contents and length of the string*/
	public void lencon(String name) {
		System.out.print("contents of the string: " +name + "\n");
		System.out.print("length of the string: "+ name.length() + "\n" );
		
	}
	/* Function to create a square*/
	public int[] square(int n) {
		int square[]=new int[n];
		for(int i=1;i<=n;i++) {
			 square[i-1] =i*i;
		}
		return square;
	}
	/* guess the number game*/
	@SuppressWarnings("resource")
	public String game(int n) {
		int game = 0;
		int j = 1;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		  String name = myObj.nextLine();
		
		
		do {
			
		  System.out.println("Guess Number \n");
		  String guess = myObj.nextLine(); 
		  
		  if( isInteger(guess)) 
			  {
			  game = Integer.parseInt(guess); 
			  
		  

		  
		  if(game > n) {
			  System.out.print("Number is too  Large! "+name +"\n");
			  j++;
		  }
		  if(game < n) {
			  System.out.print("Number is too  Small! "+name +"\n");
			  j++;
		  }
		  if(game == n) {
			  System.out.print("Perfect match!!! You are amazing "+name+ "\n");
			  
		  }
			  } else {
				  System.out.print("Guess the number again");
			  }
		  
		}while(game!= n);
		
		
		
		return name+" you took " + j +" chances to guess correct number";
			
	}
	
	
	protected boolean isInteger( String guess) {
		try 
	        { 
	             
	            Integer.parseInt(guess); 
	            return true;
	          
	        }  
	        catch (NumberFormatException e)  
	        { 
	            System.out.println(guess + " is not a valid integer number"); 
	            return false ;
	        }
	}
	public void leapYear() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	int year = scan.nextInt();
    	if(year % 400 == 0) {
  
    				System.out.print("this is a leap year");
    		
    	}
    	else if(year % 100 != 0 && year % 4 == 0){
    		System.out.print("this is a leap year");
    		
    	}
    	else {
    		System.out.print("this is not a leap year");
    	}
    
	}	
	
//main Function
public static void main(String args[]) {
multab mT = new multab();
  
  int[] var = mT.multiplication(12,11);
  
	System.out.print(Arrays.toString(var) + "\n");
	multab mT1 = new multab();
	mT1.lencon("Spoorthy");
	multab mT2 = new multab();
	int[] array = new int[] {10,12,45,67,95,06};
	mT2.tableInfo(array) ;
	multab mT3 = new multab();
	int[] sq = mT3.square(13);
	System.out.print(Arrays.toString(sq) + "\n");
	//String chances = mT3.game(23);
	Random rand = new Random(); 
    int randint = rand.nextInt(100);
    mT3.game(randint);
   // System.out.print(randint);
    
			
	//System.out.print(chances);
	//multab mT4 = new multab();
	//mT4.leapYear();
 
}
} 

	