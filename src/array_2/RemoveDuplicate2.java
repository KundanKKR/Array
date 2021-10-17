package array_2;

public class RemoveDuplicate2 
{
	public static int[] removeDuplicate(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int arrNew[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			arrNew[arr[i]]++;
		}
		return arrNew;
	}
	public static void main(String[] args) 
	{
		int[] arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		int[] arrNew=removeDuplicate(arr);
		System.out.println("array after removing duplicate element is:");
		for(int i=0;i<arrNew.length;i++)
		{
			if(arrNew[i]==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arrNew.length;i++)
		{
			if(arrNew[i]!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
