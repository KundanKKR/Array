package array_2;

public class RemoveDuplicate 
{
	public static void removeDuplicate(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[j]=max+1;
			}
		}
		System.out.println("array after removing duplicate element is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max+1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		removeDuplicate(arr);
	}
}
