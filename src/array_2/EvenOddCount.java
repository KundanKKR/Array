package Array_2;

import java.util.Scanner;

public class EvenOddCount
{
	static int[] countEO(int[] arr)
	{
		int[] eo= {0,0};
		for(int i=0;i<arr.length;i++)
		{
			eo[arr[i]%2]++;
		}
		return eo;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		int[] eo=countEO(arr);
		System.out.println("total even nos in the array is "+eo[0]);
		System.out.println("total odd nos in the array is "+eo[1]);
	}
}
