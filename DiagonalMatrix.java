// check whether given matrix is diagonal matrix or not

import java.util.Scanner;
class MatrixMultiply{
	public static void main (String args [])
	{
		
		Scanner sc =new Scanner(System.in);
		
		//input of rows and columns
		
		System.out.print("Enter rows of matrix :");
		int r=sc.nextInt();
		System.out.print("Enter columns of matrix :");
		int c=sc.nextInt();
		
		
		int m[][]=new int[r][c];
		
		//check whether diagonal is possible or not
		
		if(r==c)
		System.out.println("Diagonal matrix is possible");
		else
		System.out.println("Diagonal matrix is not possible");
		
		//input element of  matrix
		
		System.out.println("enter element of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("enter element "+(i+1)+","+(j+1)+":");
				m[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("matrix is ..");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		
		//trace the matrix
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(m[i][j]!=0)
				{
					if(i==j)
					{
						continue;
					}	
					else
					{
			            System.out.println("Matrix is not diagonal Matrix");
						System.exit(1);
					}
				}
				 	
			}
		}
	    System.out.println("Matrix is diagonal Matrix");
	}
}