package array_2;
import java.util.Scanner;
public class CountPerfectNumber
{
	public static boolean isPerfect(int num)
	{
		int divSum=0;
		int i=1;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				divSum+=i;
			}
			i++;
		}
		
		return divSum==num;
	}
	public static int calculatePerfectNumber(int[] arr)
	{
		int cp = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPerfect(arr[i]))
			{
				cp++;
			}
		}
		return cp;
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
		System.out.println("Total perfect number present in the array is "+calculatePerfectNumber(arr));
	}
}
