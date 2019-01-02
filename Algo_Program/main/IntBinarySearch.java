package main;
import java.util.Arrays;
import java.util.Scanner;
import util.Utility;
public class IntBinarySearch {
	public static void main(String args[]) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) 
			arr[i]=scan.nextInt();
		Arrays.sort(arr);
		System.out.println("Enter the elements to be searched");
		int x = scan.nextInt();
		int flag = Utility.intBinarySearch(arr, 0, n-1, x);
		if(flag==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found");
		scan.close();
	}
}
