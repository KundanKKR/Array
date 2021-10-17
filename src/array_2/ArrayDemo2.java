package Array_2;

import java.util.Scanner;

public class ArrayDemo2
{
	public static void main(String[] args)
	{
		/*
		 * int arr[]=new int[5]; for(int i=0;i<arr.length;i++) {
		 * System.out.println(arr[i]); }
		 * 
		 * System.out.println("\n"+arr[2]);
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("entered array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
