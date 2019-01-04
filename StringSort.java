package main;
import java.util.Scanner;
import util.Utility;
public class StringSort {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of word you like to enter :-");
		int count = scan.nextInt();
		String[] content = new String[count];
		//String[] content1 = new String[count];
		System.out.println("Enter the word and press enter after every word:-");
		for(int i=0;i<count;i++)
			content[i]=scan.next();
		content=Utility.stringInsertionSort(content);
		for(int i=0;i<count;i++)
			System.out.println(content[i]);
		scan.close();
	}
}
