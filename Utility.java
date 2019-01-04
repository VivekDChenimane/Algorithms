package util;

import java.util.Scanner;

public class Utility {

	public static boolean isAnagram(String str1, String str2) {
		
		return false;
	}

	public static void prime(int range)
	{
			int[] primes = new int[(int)Math.sqrt(range)+1];
			primes[0] = 2;
			int primenos = 1;
			int n=2;
			for(int i=2;i<range;i++) 
			{
				n++;
				for(int j=primenos-1;j>=0;j--)
				{
					if(n%primes[j]==0)
						break;
					if(primes[j]==2)
					{
						primes[primenos]=n;
						primenos++;
						break;
					}
				}
			}
			for(int i=0;i<primenos;i++) {
			System.out.println(primes[i]);
			}
	}
			
	
	public static int intBinarySearch(int[] arr,int left,int right,int x) {
		if(left<=right)
		{
			int mid = left+(right-left)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]>=x)
				return intBinarySearch(arr,left,mid-1,x);
			return intBinarySearch(arr,mid+1,right,x);
		}
		return -1;
	}
	
	
	public static int stringBinarySearch(String[] arr,int left,int right,String x) {
		if(left<=right)
		{
			int mid = left+(right-left)/2;
			 if(arr[mid].compareTo(x)==0)
				return mid;
			if(arr[mid].compareTo(x)>0)
				return stringBinarySearch(arr,left,mid-1,x);
			return stringBinarySearch(arr,mid+1,right,x);
		}
		return -1;
	}
	
	public static int[] intInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
	
public static String[] stringInsertionSort(String[] input){
        
        String temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--) {
            		if(input[j].compareTo(input[j-1])<0)
            		{
            			temp = input[j];
            			input[j] = input[j-1];
            			input[j-1] = temp;
            		}
            }
        }
        return input;
    }


public static int[] intBubbleSort(int[] input) {
	int temp;
	for(int i=0;i<input.length-1;i++)
		for(int j=0;j<input.length-i-1;j++) 
		{
			if(input[j]>input[j+1])
			{
			 temp = input[j];
             input[j] = input[j+1];
             input[j+1] = temp;
			}
		}
	return input;
	
}

public static String[] stringBubbleSort(String[] input) {
	String temp;
	for(int i=0;i<input.length-1;i++)
		for(int j=0;j<input.length-i-1;j++) 
		{
			if(input[j].compareToIgnoreCase(input[j+1])>1)
			{
			 temp = input[j];
             input[j] = input[j+1];
             input[j+1] = temp;
			}
		}
	return input;
	
}

	public static void temperaturConversion(double temperature, int i) {
		double ctof=0, ftoc;
		if(i==1) 
		{  
		  ctof = (temperature * 9/5) + 32;
		  System.out.println("Converting temperature from celsius to fahreinheit:" +ctof);
		}
		if(i==2) 
		{
		   ftoc = (temperature - 32) * 5/9;
		   System.out.println("Converting temperature from fahreinheit to celsius:" +ftoc);
		}
	}
	static Scanner scan = new Scanner(System.in);
	
	public static int numberSearch(int left,int right,int n) {
		int count = n+1;
		int mid = left+(right-left)/2;
		if(left<right)
		{  
			if(left==right-1)
			{
				System.out.println("Is the number "+left);
				System.out.println("If yes press -> y, If no press ->n");
				String check = scan.next();	
				if(check.compareToIgnoreCase("y")==0) 
					return left;
				if(check.compareToIgnoreCase("n")==0) 
					return right;
			}
			System.out.println("Is the number in the range"+mid+"-"+right);
			System.out.println("If yes press -> y, If no press ->n");
			String check = scan.next();	
			if(check.compareToIgnoreCase("y")==0) 
				mid=numberSearch(mid,right,count);
			if(check.compareToIgnoreCase("n")==0) 
				mid=numberSearch(left,mid-1,count);	
		}
		return mid;
	}
	
	
	public static boolean wordChecker(String word)
	{
		 
		return false;
	}

	public static void divide(String[] arr,int left,int right)
	{
		if(left<right)
		{
			int mid =(left+right)/2;
			divide(arr,left,mid);
			divide(arr,mid+1,right);
		}
		if(left==right)
			conquer
	}
}
