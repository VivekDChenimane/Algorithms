package main;
import util.Utility;
import java.util.Scanner;
public class TempConvertor {
	public static void main(String[] args)
	{
		Scanner  scan = new Scanner(System.in);
		System.out.println("Choose your input as 1 if celsius 2 if fahreinheit");
		int i = scan.nextInt();
		double temperature=1; 
		if(i==1) 
		{
			System.out.println("Enter temperature in celsius"); 
			 temperature = scan.nextDouble();
		}
		else if(i==2) 
		{
			System.out.println("Enter temperature in fahreinheit");
			 temperature = scan.nextDouble();
		}
		else
			System.out.println("Enter the correct option");
		Utility.temperaturConversion(temperature,i);
		scan.close();
	}
}
