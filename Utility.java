package util;

public class Utility {

	public static boolean isAnagram(String str1, String str2) {
		
		return false;
	}

	public static void prime(int range)
	{
			int[] primes = new int[35];
			primes[0] = 1;
			primes[1] = 2;
			int n=2;
			if(range>2) 
			{		
				while(range<=n)
				{
					for(int i=1;i<primes.length;i++)
					{
						if(n/primes[i]==0) 
						{
							break;
						}	
					}
					n++;
				}
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

}
