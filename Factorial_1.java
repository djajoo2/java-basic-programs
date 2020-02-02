// factorial of function using recursion

class Factorial_1
{
 static int factorial(int n)
 {
  if(n==0)
   return 1;
  return n*factorial(n-1);
 }
 public static void main(String args[])
 {
  int x=5;
  System.out.print(factorial(x));
 }
}