package array_2;

import java.util.Scanner;

public class CountThree
{
	static int three(int num)
	{
		int ct=0;
		while(num!=0)
		{
			if(num%10==3)
				ct++;
			num/=10;
		}
		return ct;
	}
	static int countThree(int[] arr)
	{
		int ct=0;
		for(int i=0;i<arr.length;i++)
		{
			ct=ct+three(arr[i]);
		}
		return ct;
	}
	public static void main(String[] args)
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
		System.out.println("Total no. of 3s in the array is "+countThree(arr));
	}
}
