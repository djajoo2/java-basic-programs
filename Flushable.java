//solve flushable problem in java using console

import java.io.Console;

class Flushable{
	public static void main(String args[]){
		Console con=System.console();
		int roll_no;
		String name;
		System.out.print("enter roll no :");
		roll_no=Integer.parseInt(con.readLine());
	    System.out.print("enter name :");
		name=con.readLine();
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
	}
}