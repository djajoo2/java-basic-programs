// check whether given matrix is lower triangukar matrix or not

import java.util.Scanner;
class LowerTriangularMatrix{
	public static void main (String args [])
	{
		Scanner sc =new Scanner(System.in);
		
		//input of rows and columns
		
		System.out.print("Enter rows of matrix :");
		int r=sc.nextInt();
		System.out.print("Enter columns of matrix :");
		int c=sc.nextInt();
		
		
		int m[][]=new int[r][c];
		
		//check whether lower triangular matrix is possible or not
		
		if(r==c)
		System.out.println("lower triangular matrix is possible");
		else
		System.out.println("lower triangular matrix is not possible");
		
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
					if(i<j)
					{
						System.out.println("Matrix is not Lower triangular Matrix");
						System.exit(1);
					}
					else
					{
						continue;
					}
				}
				 	
			}
		}
		System.out.println("Matrix is Lower Triangular Matrix");
	}
}