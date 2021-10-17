package array;
import java.util.Scanner;
public class ArrayDemo
{
	static int[] sort(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		s.close();
		
		a=sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
