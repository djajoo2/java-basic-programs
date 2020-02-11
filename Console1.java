// by using console input to add two no

import java.io.Console;

class Console1{
	public static void main(String args[]){
		Console con=System.console();
		System.out.print("enter 1st integer");
		int a=Integer.parseInt(con.readLine());
		System.out.print("enter 2nd integer");
		int b=Integer.parseInt(con.readLine());
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
}