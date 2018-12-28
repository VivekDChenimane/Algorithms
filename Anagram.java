package main;
import java.util.Scanner;
import util.Utility;
public class Anagram {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 2 String values");
		String str1 = scan.next();
		String str2 = scan.next();
		boolean anagram = Utility.isAnagram(str1,str2);		
		if(anagram)
			System.out.println("It is anagram");
		else
			System.out.println("Not a anagram");
	}
}
