package array_2;

import java.util.Scanner;

public class InsertElement 
{
	public static int[] insertElementAtIndex(int[] arr,int num,int ind)
	{
		if(ind<0 || ind>=arr.length)
			return null;
		int[] arrNew=new int[arr.length+1];
		arrNew[ind]=num;
		for(int i=0;i<arrNew.length;i++)
		{
			if(i<ind)
			{
				arrNew[i]=arr[i];
			}
			else if(i>ind)
			{
				arrNew[i]=arr[i-1];
			}
		}
		return arrNew;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int []arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		System.out.println("enter a number to insert in the array");
		int num=scan.nextInt();
		System.out.println("At what index, number to be inserted");
		int ind=scan.nextInt();
		scan.close();
		arr=insertElementAtIndex(arr,num,ind);
		if(arr!=null)
		{
			System.out.println("array after insertion is:");
			Array.displayArray(arr);
		}
		else
		{
			System.err.println("sorry, index is out of bounds!!!");
		}
	}
}
