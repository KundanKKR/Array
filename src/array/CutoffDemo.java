package array;
import java.util.Scanner;
public class CutoffDemo 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter num and cotoff");
		int num=s.nextInt();
		int cutoff=s.nextInt();
		int arr[]=new int[num];
		System.out.println("enter "+num+" values ");
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		int ct=0;
		for(int i=0;i<num;i++)
		{
			if(arr[i]<cutoff)
			{
				ct++;
			}
		}
		System.out.println(ct);
	}
}
