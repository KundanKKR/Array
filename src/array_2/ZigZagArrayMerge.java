package array_2;

import java.util.Scanner;

public class ZigZagArrayMerge
{
	public static int[] mergeZigZagArray(int arr1[],int[] arr2)
	{
		int[] merge=new int[arr1.length+arr2.length];
		for(int i=0,j=0;i<merge.length;j++)
		{
			if(j<arr1.length)
				merge[i++]=arr1[j];
			if(j<arr2.length)
				merge[i++]=arr2[j];
		}
		return merge;
	}
	public static int[] enterArrayElements(Scanner scan)
	{
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int[] arr1=enterArrayElements(scan);
		System.out.println("enter the size of 2nd array");
		int arr2[]=enterArrayElements(scan);
		int arr3[]=mergeZigZagArray(arr1,arr2);
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
