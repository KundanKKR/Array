package Array_2;

import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many products you want to enter");
		int size=scan.nextInt();
		int price[]=new int[size];
		System.out.println("enter price of "+size+" products");
		for(int i=0;i<size;i++)
		{
			price[i]=scan.nextInt();
		}
		int totalPrice=0;
		for(int i=0;i<price.length;i++)
		{
			totalPrice+=price[i];
		}
		System.out.println("total price is "+totalPrice);
		System.out.println("avg price is "+totalPrice/size);
	}
}
