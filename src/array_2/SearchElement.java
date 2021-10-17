package array_2;

import java.util.Scanner;

public class SearchElement
{
	public static int searchElement(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[]=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to be searched in the array");
		int num=scan.nextInt();
		scan.close();
		int index=searchElement(arr,num);
		if(index!=-1)
		{
			System.out.println(num+" is present at index "+index+" in the array");
		}
		else
		{
			System.err.println(num+" is not present in the array");
		}
	}
}
