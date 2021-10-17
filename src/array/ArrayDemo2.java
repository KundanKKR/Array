package array;
import java.util.Scanner;
public class ArrayDemo2
{
	static int[] sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
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
