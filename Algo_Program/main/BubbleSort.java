package main;
import util.Utility;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of elements you want to enter");
		int n = scan.nextInt();
		System.out.println("Enter 1 for Interger sorting and 2 for String sorting");
		int k = scan.nextInt();
		System.out.println("Enter the elements");
		if(k==1) {
			int[] arr = new int[n];
			for(int i=0 ; i<n;i++)
				arr[i]=scan.nextInt();
			arr = Utility.intBubbleSort(arr);
			for(int i=0 ; i<n;i++)
				System.out.println(arr[i]);
		}
		if(k==2) {
			String[] arr1 = new String[n];
			for(int i=0 ; i<n;i++)
				arr1[i]=scan.next();
			arr1 = Utility.stringBubbleSort(arr1);
			for(int i=0 ; i<n;i++)
				System.out.println(arr1[i]);
		}
		scan.close();
	}
}
