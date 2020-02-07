// column wise sorting in matrix

import java.util.Scanner;
class ColumnSorting{
	public static void main (String args [])
	{
		
		Scanner sc =new Scanner(System.in);
		
		//input of rows and columns
		
		System.out.print("Enter rows of matrix :");
		int r=sc.nextInt();
		System.out.print("Enter columns of matrix :");
		int c=sc.nextInt();
		
		
		int m[][]=new int[r][c];
		
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
		
		
        System.out.println("output matrix....");
  
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{ 
    			System.out.print(m[i][j]+"\t");
   			}
   		System.out.println();
  		}
		
		for(int k=0;k<c;k++)
		{
			for(int i=0;i<r-1;i++)
		    {
				for(int j=i+1;j<r;j++)
				{
					if(m[i][k]>m[j][k])
					{
						int t=m[i][k];
						m[i][k]=m[j][k];
						m[j][k]=t;
					}
				}
		    }
		}
		
		
        System.out.println("output matrix after sorting....");
  
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{ 
    			System.out.print(m[i][j]+"\t");
   			}
   		System.out.println();
  		}		
	}
}	