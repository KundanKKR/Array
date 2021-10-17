package array_2;

public class RemoveDuplicate3
{
	public static void removeDuplicate(int[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[size-1];
					size--;
					j--;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
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
