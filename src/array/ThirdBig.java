package array;
import java.util.Scanner;
public class ThirdBig
{
	static int thirdBig(int[] a)
	{
		int tbig=0;
		int sbig=0;
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>big)
			{
				tbig=sbig;
				sbig=big;
				big=a[i];
			}
			else if(sbig<a[i] && big!=a[i])
			{
				tbig=sbig;
				sbig=a[i];
			}
			else if(a[i]>tbig && sbig!=a[i] && big!=a[i])
			{
				tbig=a[i];
			}
		}
		return tbig;
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
		int tbig=thirdBig(a);
		System.out.println("3rd biggest elements is "+tbig);
	}
}
