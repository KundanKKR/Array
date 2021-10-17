package Array_2;

import java.util.Scanner;

public class PrimeNumber
{
	public static int findPrimeNumber(int[] arr)
	{
		int ct=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				ct++;
			}
		}
		return ct;
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" integer values");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		int primeNumber=findPrimeNumber(arr);
		System.out.println("total prime numbers in the array is "+primeNumber);
	}
}
