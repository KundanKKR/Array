package Array_2;

import java.util.Scanner;

public class EldestPerson
{
	public static int findEldestPersonAge(int age[])
	{
		int eldest=age[0];
		for(int i=1;i<age.length;i++)
		{
			if(age[i]>eldest)
				eldest=age[i];
		}
		return eldest;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int age[]=new int[size];
		System.out.println("enter "+size+" person's age");
		for(int i=0;i<size;i++)
		{
			age[i]=scan.nextInt();
		}
		System.out.println("eldest person age is "+findEldestPersonAge(age));
	}
}
