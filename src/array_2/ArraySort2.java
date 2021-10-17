package array_2;

public class ArraySort2
{
	public static int[] sortArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j+1<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int[] arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		int[] sortedArray=sortArray(arr);
		System.out.println("sorted array is:");
		Array.displayArray(sortedArray);
	}
}
