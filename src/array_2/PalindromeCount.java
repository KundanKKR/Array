package array_2;

import java.util.Scanner;

public class PalindromeCount
{
	public static int countPalindrome(int[] arr)
	{
		int cp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				cp++;
			}
		}
		return cp;
	}
	public static boolean isPalindrome(int num)
	{
		int temp=num,sum=0;
		while(num!=0)
		{
			sum=sum*10+num%10;
			num/=10;
		}
		return temp==sum;
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
		System.out.println("palindrome no. present in the array is "+countPalindrome(arr));
	}
}
