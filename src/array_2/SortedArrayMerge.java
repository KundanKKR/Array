package array_2;

public class SortedArrayMerge
{
	public static int[] sortedArrayMerge(int[] arr1, int[] arr2)
	{
		int []mergedArray=new int[arr1.length+arr2.length];
		
		for(int i=0,j=0,k=0;i<mergedArray.length;i++)
		{
			if(j<arr1.length && k<arr2.length)
			{
				if(arr1[j]<arr2[k])
				{
					mergedArray[i]=arr1[j++];
				}
				else
				{
					mergedArray[i]=arr2[k++];
				}
			}
			else if(j<arr1.length)
			{
				mergedArray[i]=arr1[j++];
			}
			else if(k<arr2.length)
			{
				mergedArray[i]=arr2[k++];
			}
		}
		return mergedArray;
	}
	public static void main(String[] args)
	{
		System.out.println("first array");
		int[] arr1=Array.readArray();
		Array.displayArray(arr1);
		System.out.println("second array");
		int[] arr2=Array.readArray();
		Array.displayArray(arr2);
		int mergedArray[]=sortedArrayMerge(arr1,arr2);
		System.out.println("merged array in sorted array is:");
		Array.displayArray(mergedArray);
	}
}
