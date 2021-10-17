package array_2;

import java.util.Scanner;

public class MergeArray
{
	public static int[] mergeArray(int[] arr1,int arr2[])
	{
		int mergedArray[]=new int[arr1.length+arr2.length];

		/*for(int i=0,j=0;i<mergedArray.length;i++)
		{ 
			if(i<arr1.length) 
			{
				mergedArray[i]=arr1[i]; 
			}
			else
			{
				mergedArray[i]=arr2[j++]; 
			}
		}*/
		int i=0,j=0;
		while(i<arr1.length)
		{
			mergedArray[i]=arr1[i];
			i++;
		}
		while(j<arr2.length)
		{
			mergedArray[i]=arr2[j++];
			i++;
		}

		return mergedArray;

	}
	public static int[] arrayInput(int arr[],Scanner scan)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int size1=scan.nextInt();
		int arr1[]=new int[size1];
		System.out.println("enter "+size1+" elements of 1st array");
		arr1=arrayInput(arr1,scan);
		System.out.println("enter the size of 2nd array");
		int size2=scan.nextInt();
		int arr2[]=new int[size2];
		System.out.println("enter "+size2+" elements of 2nd array");
		arr2=arrayInput(arr2,scan);
		System.out.println("merged array is ");
		int []mergedArray=mergeArray(arr1,arr2);
		for(int i=0;i<mergedArray.length;i++)
		{
			System.out.print(mergedArray[i]+" ");
		}
	}
}
