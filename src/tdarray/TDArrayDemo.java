package tdarray;
public class TDArrayDemo
{
	public static void main(String[] args) 
	{
		int[][] mat= {{1,2,3},{4,5,6},{7,8}};
		/*System.out.println(mat);
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);
		System.out.println(mat[0][1]);
		System.out.println(mat[2][1]);*/
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
