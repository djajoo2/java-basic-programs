import java.util.Scanner;

class Complex{
	private int real,imag;
	
	Complex(){
		real=0;
		imag=0;
	}
	
	Complex(int real,int imag)
	{
		this.real=real;
		this.imag=real;
	}
	
	void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter real no. ");
		real=sc.nextInt();
	    System.out.print("enter imaginary no. ");
		imag=sc.nextInt();
	}
	
	Complex sum(Complex c){
		Complex t=new Complex();
		t.real=real+c.real;
		t.imag=imag+c.imag;
		return t;
	}
	
	Complex mult(Complex c){
		Complex t=new Complex();
		t.real=real*c.real-imag*c.imag;
		t.imag=real*c.imag+imag*c.real;
		return t;
	}
	
	void display()
	{
		if(imag>0)
			System.out.println(real+"+"+imag+"i");
		else
			System.out.println(real+" "+imag+"i");
	}
}

class ComplexTest{
	public static void main(String args[]){
		Complex c1,c2,c3,c4;
		c1=new Complex();
		c2=new Complex();
		c1.getdata();
		c2.getdata();
		c3=c1.sum(c2);
		c3.display();
		c4=c1.mult(c2);
		c4.display();
	}
}