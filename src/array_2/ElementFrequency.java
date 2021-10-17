package array_2;

public class ElementFrequency
{
	public static void findFrequency(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int ct=1;boolean bl=true;
			for(int j=0;j<arr.length;j++)
			{
				if(j<i && arr[j]==arr[i])
				{
					bl=!bl;
					break;
				}
				if(j>i && arr[j]==arr[i])
				{
					ct++;
				}
			}
			if(bl)
			{
				System.out.println(arr[i]+" --> "+ct);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		findFrequency(arr);
	}
}
