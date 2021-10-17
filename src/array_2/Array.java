package array_2;

import java.util.Scanner;

public class Array 
{
	public static int[] readArray()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void displayArray(int[] arr)
	{
		//System.out.println("entered array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
}
