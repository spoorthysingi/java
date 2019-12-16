import java.util.Random;
import java.util.Scanner;

public class game {
	
	public String game1(int n) {
		int game = 0;
		int j = 1;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		  String name = myObj.nextLine();
		
		
		do {
			
		  System.out.println("Guess Number ");
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
				  System.out.print("Guess the number again \n");
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

public static void main(String args[]) {
	game g1 = new game();
	Random rand = new Random(); 
    int randint = rand.nextInt(100);
   String chances = g1.game1(randint);
   System.out.print(chances);
}
	
}
