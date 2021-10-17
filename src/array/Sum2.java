package array;
public class Sum2 
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
			else if(i+2<a.length && a[i]+a[i+1]>a[i+2])
			{
				sum+=a[i];
			}
			else if(i+2>=a.length && a[i]+a[i+1]>key)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
