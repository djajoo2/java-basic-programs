import java.util.Scanner;
class ArrayTranspose
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter no of rows :");
  int r=sc.nextInt();
  System.out.print("enter no of columns :");
  int c=sc.nextInt();
  int M[][]=new int[r][c];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    System.out.print("enter element "+(i+1)+","+(j+1)+" : ");
    M[i][j]=sc.nextInt();
   }
  }
  System.out.println("output matrix");
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    System.out.print(M[i][j]+"\t");
   }
   System.out.println();
  }
  System.out.println("output transpose");
  for(int i=0;i<c;i++)
  {
   for(int j=0;j<r;j++)
   {
    System.out.print(M[j][i]+"\t");
   }
   System.out.println();
  }
 }
} 