package main;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import util.Utility;
//import util.Utility;
public class BinSearchFromWordList {
	public static void main(String args[])throws FileNotFoundException{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the path of the file");
	String path = scan.next();
	File file = new File(path);	
	Scanner sc = new Scanner(file);
	sc.useDelimiter(",");
	System.out.println("Please enter the word to be searched");
	String word = scan.next();
	int count = 0;
	while(sc.hasNext(".") || count<=10)
		count++;
	String[] fileContent = new String[count-1];
	int i =0;
	while(sc.hasNext()) 
	{
		fileContent[i]=sc.next();
		System.out.println(fileContent[i]);
	}
	fileContent=Utility.stringInsertionSort(fileContent);
	i=Utility.stringBinarySearch(fileContent, 0, count, word);
	if(i>=0)
		System.out.println("The word "+word+"exists in the path"+path+".");
	scan.close();
	sc.close();
	}
}