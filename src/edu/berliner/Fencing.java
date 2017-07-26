package edu.berliner;
import java.util.Scanner;

public class Fencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		//Variables and instantiations
		double length=0.0;
		double width=0.0;
		double perimeter=0.0;
		int gates=0;
		int fenceType=0;
		int fencePrice=0;
		double total=0.0;
		Scanner scan = new Scanner(System.in);
		
//Get input from user
//Ask for perimeter
		System.out.println("What is the length of the yard to be fenced?");
		length=scan.nextDouble();
		System.out.println("What is the width of the yard to be fenced?");
		width=scan.nextDouble();
		perimeter=(2*length)+(2*width); 
		
//Ask for number of gates
		System.out.println("How many gates? You must purchase at least one, but no more than three.");
		while(gates<1 || gates>3){
			gates=scan.nextInt();
			if(gates<1)
			{
				System.out.println("You must buy at least one gate. Try again.");
				
			}
			else if (gates > 3)
			{
				System.out.println("You can not buy more than three gates. Try again.");
			}
		}
		
		
//Ask for type of fencing
		System.out.println("What type of fencing are you purchasing? Type \"1\" for wood and \"2\" for chain.");
		while(fenceType!=1 && fenceType!=2){
			fenceType=scan.nextInt();
			if(fenceType==1)
			{
				fencePrice=25;
			}
			else if(fenceType==2) 
			{
				fencePrice=15;
			}
			else
			{
				System.out.println("There are only two options.  Wood, \"1\", and chain, \"2\". Try again.");
				//scan.nextLine();
			}
		}
		
		
//Calculate and print fencing total
		total = (((perimeter*fencePrice)+(gates*150))*1.06)+50;
		System.out.printf("Your total fencing cost is %.2f", total);
	}
	catch(java.util.InputMismatchException e)
    {
		System.out.println("Please type a number... Try again.");		
    }
	}
}
