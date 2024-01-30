package tetration;

import java.util.Scanner;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class hellothere {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
			System.out.println("Do you want pentation or tetration? say x if you want pentation, then enter 2 numbers, say y for superroot and z for superlogarthim");
			
			String input = myObj.nextLine();
		
			
			
	
		  System.out.println("Enter A");
		  double An = myObj.nextDouble();
		  
		 
		  double Bn = myObj.nextDouble();
		  
		  double answer = An;
		  BigDecimal answer1 = BigDecimal.valueOf(answer);
		  if (input.equals("x"))
		  {
			
			for (int j = 1; j < An; j++) // will do a^^a 
			 {
					  
				  for (int k = 0; k < Bn; k++)
					 {
					  answer = ((Math.pow(An, answer)));
					  answer1 = BigDecimal.valueOf(answer);
					 }
			 }
			 
			 
			 
			  
			
			 
		  }
		  else if (input.equals("y"))
		  {
			 
			  double precision = 0.001;
			  double answer3 = 0;
			  Boolean balls = false;
			 
			  while (superrootcheck(answer3, An) < (Bn - 0.1) || superrootcheck(answer3, An) > (Bn + 0.1) && !balls)
					  {
				  		answer3 += 0.00001;
				  	   System.out.println(answer3);
				  	   
					  }
			  if (superrootcheck(answer3, An) > (Bn - 0.01) || superrootcheck(answer3, An) < (Bn + 0.01))
					  {
				         balls = true;
					  }
			 answer1 = BigDecimal.valueOf(answer3);
			
			 
		  }
		  else if (input.equals("z"))
		  {
			  double precision = 0.001;
			  double answer3 = 0;
			  Boolean balls = false;
			 
			  while (superrootcheck(An, answer3) < (Bn - 0.01) || superrootcheck(An, answer3) > (Bn + 0.01) && !balls)
					  {
				  		answer3 += 0.00001;
				  	   System.out.println(answer3);
				  	   
					  }
			  if (superrootcheck(An, answer3) > (Bn - 0.01) || superrootcheck(An, answer) < (Bn + 0.01))
					  {
				         balls = true;
				         answer3++;
					  }
			 answer1 = BigDecimal.valueOf(answer3);
		  }
		  else
		  {
			  for (int j = 1; j < Bn; j++)
			  {
				  answer = Math.pow(An, answer);
				  answer1 = BigDecimal.valueOf(answer);
			  }
		  }
		  
		  
		  System.out.println(answer1);
		  

	}
	
	public static double superrootcheck(double a, double b)
	{
		 double answer2 = a;
		 for (int j = 1; j < b; j++)
		 {
			  {
				 
				  answer2 = Math.pow(a, answer2);
				 
			  }
		 }
		  
		
		return answer2;
	}
	

}
