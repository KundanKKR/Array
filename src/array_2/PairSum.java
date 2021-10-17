package array_2;
import java.util.*;
public class PairSum 
{
	public static void findPair(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		scan.close();
		findPair(arr,num);
	}
}
