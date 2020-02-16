// student details using class

import java.io.Console;

class Student{
	private int roll_no,sub1,sub2;
	private String name;
	private float per;
	
	void getdata(){
		Console con=System.console();
		System.out.print("enter roll no : ");
		roll_no=Integer.parseInt(con.readLine());
		System.out.print("enter name : ");
		name=con.readLine();
		System.out.print("enter marks of sub1 : ");
		sub1=Integer.parseInt(con.readLine());
		System.out.print("enter marks of sub2 : ");
		sub2=Integer.parseInt(con.readLine());
	}
	
	void per_calc(){
		per =((sub1+sub2)/200.0f)*100;
	}
	
	void display(){
		System.out.println(roll_no+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+per);
	}
}

class StudentTest1{
	public static void main(String args []){
		Student s1,s2;
		s1=new Student();
		s2=new Student();
		s1.getdata();
		s1.per_calc();
		s2.getdata();
		s2.per_calc();
		System.out.println("roll no"+"\t"+"name"+"\t"+"sub1"+"\t"+"sub2"+"\t"+"percentage");
		s1.display();
		s2.display();
	}
}

class StudentTest2{
	public static void main(String args []){
		int n;
		Console con=System.console();
		System.out.print("enter no of student : ");
		n=Integer.parseInt(con.readLine());
        Student s[]=new Student[n];  
		for(int i=0;i<n;i++)
		{
	        s[i]=new Student();
			s[i].getdata();
			s[i].per_calc();
		}
		
		System.out.println("roll no"+"\t"+"name"+"\t"+"sub1"+"\t"+"sub2"+"\t"+"percentage");
		for(int i=0;i<n;i++){
			s[i].display();
		}
	}
}