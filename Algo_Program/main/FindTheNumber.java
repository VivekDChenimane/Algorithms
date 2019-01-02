package main;
import java.util.Scanner;
import util.Utility;
public class FindTheNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the number,press enter after first number");
		int first = scan.nextInt();
		int last = scan.nextInt();
		int value = Utility.numberSearch(first,last,0);
		System.out.println("The number you choose was"+value);
		scan.close();
	}
}
