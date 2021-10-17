package array_2;
import java.util.*;
public class DeleteElement
{
	public static int[] deleteElement(int[] arr, int ind)
	{
		if(ind<0 || ind>=arr.length)
			return null;
		int arrNew[]=new int[arr.length-1];
		for(int i=0;i<arrNew.length;i++)
		{
			if(i<ind)
			{
				arrNew[i]=arr[i];
			}
			else
			{
				arrNew[i]=arr[i+1];
			}
		}
		return arrNew;
	}
	public static void main(String[] args) 
	{
		int[] arr=Array.readArray();
		System.out.println("entered array is:");
		Array.displayArray(arr);
		Scanner scan=new Scanner(System.in);
		System.out.println("From which index element to be deleted");
		int ind=scan.nextInt();
		arr=deleteElement(arr,ind);
		if(arr!=null)
		{
			System.out.println("Array after deletion is:");
			Array.displayArray(arr);
		}
		else
		{
			System.err.println("Sorry, index is out of bounds");
		}
	}
}
