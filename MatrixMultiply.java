// multiplication of two matrix

import java.util.Scanner;
class MatrixMultiply{
	public static void main (String args [])
	{
		Scanner sc =new Scanner(System.in);
		
		//input of rows and columns
		
		System.out.print("Enter rows of 1st matrix :");
		int r1=sc.nextInt();
		System.out.print("Enter columns of 1st matrix :");
		int c1=sc.nextInt();
		System.out.print("Enter rows of 2nd matrix :");
		int r2=sc.nextInt();
		System.out.print("Enter columns of 2nd matrix :");
		int c2=sc.nextInt();
		
		// check whether multiplication is possible or not
		
		if(c1!=r2)
		{
			System.out.println("can't multiply");
			System.exit(1);
		}
		
		int m1[][]=new int[r1][c1];
		int m2[][]=new int[r2][c2];
		int m3[][]=new int[r1][c2];
		
		//input element of 1st matrix
		
		System.out.println("enter element of 1st matrix");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print("enter element "+(i+1)+","+(j+1)+":");
				m1[i][j]=sc.nextInt();
			}
		}
		
		//input element of 2nd matrix
		
		System.out.println("enter element of 2nd matrix");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print("enter element "+(i+1)+","+(j+1)+":");
				m2[i][j]=sc.nextInt();
			}
		}
		
		//multiplication of matrix
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		
		// show output of matrix
		
		System.out.println("output :");
		for(int x[]:m3)
		{
			for(int e:x)
			{
				System.out.print(e+"\t");
			}
			System.out.println();
		}
	}
}