package array;
public class Sum
{
	public static void main(String[] args)
	{
		int a[]= {2,8,10,12,6,20};
		int key=19;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1 && a[i]>key)
			{
				sum+=a[i];
			}
			else
			{
				int j=i+1;
				if(j+1<a.length && a[i]+a[j]>a[j+1])
				{
					sum+=a[i];
				}
				if(j+1>=a.length && a[i]+a[j]>key)
				{
					sum+=a[i];
				}
			}
		}
		System.out.println(sum);
	}
}
