package test;

public class Frequency
{
	static void frequency(int a[])
	{
		int x=0;
		int p=0,q=0;
		for(int i=0;i<a.length;i++)
		{
			int ct=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					ct++;
				}
			}
			if(ct>x)
			{
				p=a[i];
				q=ct;
				x=ct;
			}
		}
		System.out.println(p+" occured "+q+" times");
	}
	public static void main(String[] args)
	{
		int a[]= { 4,1,3,4,2,2,3,1,3,4,5,3};
		
		frequency(a);

	}
}
