package array_2;

public class ElementFrequency2
{
	public static void findFrequency(int[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			int ct=1;
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					ct++;
					arr[j]=arr[size-1];
					size--;
					j--;
				}
			}
			System.out.println(arr[i]+"-->"+ct);
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
