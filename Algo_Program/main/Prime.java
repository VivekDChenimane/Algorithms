package main;
import java.util.Scanner;
import util.Utility;
public class Prime {
	public static void main(String args[]) {
		 System.out.println("Enter the range from 0 to get a prime values");
		 Scanner scan = new Scanner(System.in);
		 int range = scan.nextInt();
		 Utility.prime(range);		
		 scan.close();
	}
}
