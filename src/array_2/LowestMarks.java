package Array_2;

import java.util.Scanner;

public class LowestMarks
{
	public static int findLowestMarks(int[] marks)
	{
		int min=marks[0];
		for(int i=1;i<marks.length;i++)
		{
			if(min>marks[i])
			{
				min=marks[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many student's marks you want to enter");
		int size=scan.nextInt();
		int marks[]=new int[size];
		System.out.println("enter "+size+" student's marks");
		for(int i=0;i<size;i++)
		{
			marks[i]=scan.nextInt();
		}
		scan.close();
		int lowestMarks=findLowestMarks(marks);
		System.out.println("lowest marks is "+lowestMarks);
	}
}
