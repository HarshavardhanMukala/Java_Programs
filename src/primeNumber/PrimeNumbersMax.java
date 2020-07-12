package primeNumber;

import java.util.Scanner;

public class PrimeNumbersMax {

	public static void main(String[] args) {

		//Using scanner class in java, we can read the input values
		Scanner scanner=new Scanner(System.in); 
		//to iterate the loop n no:of times
		int i=0;
		//to perform the modulus operation
		int num=0;
		//this variable os created to store the primenumbers
		String primenumbers="";
		System.out.println("Enter the value of n : ");
		
		//to scan the max value from the console
		int n= scanner.nextInt();
		scanner.close();
		//this loop will iterate till the max value selected
		for(i=1;i<=n;i++) 
		{
			int count=0;	
			for(num=i;num>=1;num--) 
			{
				if(i%num==0) {
					count = count+1;
				}	
				
			}
			
			//apart from the prime numbers, for all the remaining numbers count will be more than 2
			if(count==2) {
				primenumbers = primenumbers+i+" ";
			}
		}
		System.out.println("Primenumbers upto "+n+"are : "+primenumbers);
	}

}
