// flushable problem in java

import java.util.Scanner;

class NotFlushable{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int roll_no;
		String name;
		System.out.print("enter roll no :");
		roll_no=sc.nextInt();
		sc.nextLine();// to remove flushable problem
		System.out.print("enter name :");
		name=sc.nextLine();
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
	}
}