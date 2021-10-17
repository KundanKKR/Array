package array_2;

public class ElementFrequency3
{
	public static int[] findFrequency(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
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
		arr=findFrequency(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println(i+"-->"+arr[i]);
			}
		}
	}
}
