// transpose of matrix is equal to matrix or not

import java.util.Scanner;
class MatrixTranspose
{
	 public static void main(String args[])
	 {
	 	Scanner sc=new Scanner(System.in);
	 	
	 	//enter input
  
  		System.out.print("enter no of rows :");
  		int r=sc.nextInt();
  		System.out.print("enter no of columns :");
  		int c=sc.nextInt();
  		
  		int m[][]=new int[r][c];

	    for(int i=0;i<r;i++)
  		{
   			for(int j=0;j<c;j++)
   			{
			    System.out.print("enter element "+(i+1)+","+(j+1)+" : ");
			    m[i][j]=sc.nextInt();
		    }
        }
  
        System.out.println("output matrix....");
  
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
				if(m[i][j]==m[j][i])
					continue;
				else
				{
						System.out.println("Matrix is not equal to it's transpose ");
						System.exit(1);
				}
			}
		}
	    System.out.println("Matrix is equal to it's transpose ");
	}
} 