package array_2;

public class ArrayProduct
{
	public static int[] findArrayProduct(int []arr)
	{
		int arrNew[]=new int[arr.length];
		for(int i=0;i<arrNew.length;i++)
		{
			arrNew[i]=1;
			for(int j=0;j<arrNew.length;j++)
			{
				if(i!=j)
				{
					arrNew[i]*=arr[j];
				}
			}
		}
		
		return arrNew;
	}
	public static void main(String[] args)
	{
		int[] arr=Array.readArray();
		Array.displayArray(arr);
		int[] arrNew=findArrayProduct(arr);
		Array.displayArray(arrNew);
	}
}
