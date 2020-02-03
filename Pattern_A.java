class Pattern_A
{
 public static void main (String args [])
 {
  int n=13,i,j,k;
  for(i=1;i<=n;i++)
  {
   for(k=1;k<=(n-i);k++) 
   {
    System.out.print(" ");
   }
   for(j=1;j<=(2*i-1);j++)
   {
    if(j==1 || i==(n+1)/2 || j==2*i-1)
     System.out.print("*");
    else
     System.out.print(" ");
   }
  System.out.println();
  }
 }
}