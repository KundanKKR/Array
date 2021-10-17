package array_2;

public class ArraySort
{
	public static int[] sortArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					/*int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;*/
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		return arr;
	}
	public static int[] sortArray2(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					/*int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;*/
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
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
		arr=sortArray(arr);
		System.out.println("sorted array is:");
		Array.displayArray(arr);
		arr=sortArray2(arr);
		System.out.println("sorted array is:");
		Array.displayArray(arr);
	}
}
