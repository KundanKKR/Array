package array;
import java.util.Scanner;
public class SecondBig2
{
	static int secondBig(int[] a)
	{	
		int big=a[0];
		int sbig=0;
		for(int i=1;i<a.length;i++)
		{
			if(big<a[i])
			{
				sbig=big;
				big=a[i];
			}
			else if(sbig<a[i] && big!=a[i])
			{
				sbig=a[i];
			}
		}
		return sbig;
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
