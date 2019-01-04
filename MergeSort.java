package main;
import java.util.Scanner;
import util.Utility;
public class MergeSort {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words you want to enter");
		int n = scan.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the numbers:-");
		for(int i=0;i<n;i++)
			arr[i] = scan.next();
		Utility.divide(arr[],0,n);
		scan.close();
	}
}
