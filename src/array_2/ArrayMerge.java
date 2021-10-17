package array_2;

import java.util.Scanner;

public class ArrayMerge
{
	public static int[] mergeArray(int[] arr1, int[] arr2,int ind)
	{
		int[] mergedArray=new int[arr1.length+arr2.length];
		for(int i=0,j=0;i<mergedArray.length;i++)
		{
			if(ind<0 || ind>=arr1.length)
				return null;
			if(i<ind)
			{
				mergedArray[i]=arr1[i];
			}
			else if(j<arr2.length)
			{
				mergedArray[i]=arr2[j++];
			}
			else
			{
				mergedArray[i]=arr1[i-j];
			}
		}
		return mergedArray;
	}
	public static void main(String[] args)
	{
		int arr1[]=Array.readArray();
		System.out.println("1st array is:");
		Array.displayArray(arr1);
		int arr2[]=Array.readArray();
		System.out.println("2nd array is:");
		Array.displayArray(arr2);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the index at which 2nd array to be inserted");
		int ind=scan.nextInt();
		scan.close();
		int[] mergedArray=mergeArray(arr1,arr2,ind);
		System.out.println("merged array is:");
		Array.displayArray(mergedArray);
	}
}
