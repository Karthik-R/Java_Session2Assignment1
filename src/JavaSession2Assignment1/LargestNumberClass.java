package JavaSession2Assignment1;

import java.util.Scanner;

public class LargestNumberClass {

	public static void main(String[] args) {
	
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //Scanner class is used to accept input from user
		System.out.println("Enter the three numbers to compare");
		//Initializing the variable with user-defined values
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		//Conditional statements to find the largest of 3 numbers
		if(a > b && a > c)
		{
			System.out.println("Largest number is "+ a);
		}
		else if(b > a && b > c){
			System.out.println("Largest number is "+ b);
		}
		else if(c > a && c > b){
			System.out.println("Largest number is "+ c);
		}
		else if(a == b && b == c){
			System.out.println("All are equal: "+a+","+b+","+c);
		}else{
			System.out.println("Please enter numbers");
		}
	}

}
