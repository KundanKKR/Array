package tdarray;
import java.util.Scanner;
public class TDArray2
{
	static void read(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of rows & columns");
		int row=s.nextInt();
		int column=s.nextInt();
		int mat[][]=new int[row][column];
		System.out.println("enter "+row*column+" elements row-wise");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		System.out.println("entered array is");
		read(mat);
	}
}
