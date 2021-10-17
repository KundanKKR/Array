package array;
import java.util.Scanner;
public class SecondBig
{
	static int secondBig(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(big!=a[i])
				return a[i];
		}
		return big;
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
		
		int big=secondBig(a);
		System.out.println("second biggest element is "+big);
	}
}
