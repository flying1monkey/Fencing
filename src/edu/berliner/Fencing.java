package edu.berliner;
import java.util.Scanner;

public class Fencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables and instantiations
		double perimeter=0.0;
		int gates=0;
		int fenceType=0;
		int fencePrice=0;
		double total=0.0;
		Scanner scan = new Scanner(System.in);
		
//Get input from user
//Ask for perimeter
		System.out.println("What is the perimeter of the yard to be fenced?");
		try
		{
			perimeter=scan.nextDouble();
		}
		catch(java.util.InputMismatchException e)
	        {
				System.out.println("Please type a number... Try again.");
	            scan.nextLine();
	        }
//Ask for number of gates
		System.out.println("How many gates? You must purchase at least one, but no more than three.");
		try
		{
			while(gates<1 || gates>3)
			{
			gates=scan.nextInt();
			if(gates<1)
			{
				System.out.println("You must buy at least one gate.");
				
			}
			else if (gates > 3)
			{
				System.out.println("You can not buy more than three gates.");
			}
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Please type a number... Try again.");
			scan.nextLine();
		}
		
//Ask for type of fencing
		System.out.println("What type of fencing are you purchasing? Type \"1\" for wood and \"2\" for chain.");
		try
		{
			fenceType=scan.nextInt();
			if(fenceType!=1 && fenceType!=2)
			{
				System.out.println("There are only two options.  Wood, \"1\", and chain, \"2\". Try again.");
				scan.nextLine();
			}
			if(fenceType==1)
			{
				fencePrice=25;
			}
			else 
			{
				fencePrice=15;
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Please type a number... Try again.");
			scan.nextLine();
		}
		
//Calculate and print fencing total
		//System.out.printf("p=%f g=%d t=%d", perimeter, gates, fencePrice);
		total = (((perimeter*fencePrice)+(gates*150))*1.06)+50;
		System.out.printf("Your total fencing cost is %.2f", total);
		
		
	}

}
