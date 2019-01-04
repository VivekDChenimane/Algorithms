package main;
import java.util.Scanner;
import util.Utility;
public class IntBubbleSort {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to enter");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		arr = Utility.intBubbleSort(arr);
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		scan.close();
	}
}
