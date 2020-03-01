import java.util.Scanner;

class Box{
	private int feet,inch;
	
	Box(){}
	
	Box(int feet,int inch){
		this.feet=feet;
		this.inch=inch;
	}
	
	void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter feet ");
		feet=sc.nextInt();
		System.out.print("enter inch ");
		while(true)
		{
			inch=sc.nextInt();
			if(inch>=0 && inch<=11)
				break;
			System.out.println("Invalid enter again");
		}	
	}
	void display()
	{
		System.out.println(feet+"'"+inch+"\"");
	}
	
	Box sum(Box b){
		Box t=new Box();
		t.feet=feet+b.feet;
		t.inch=inch+b.inch;
		if(t.inch>=12){
			t.feet++;
			t.inch-=12;
		}
		return t;
	} 
}

class BoxTest{
	public static void main(String args[]){
		Box b1,b2,b3;
		b1=new Box();
		b2=new Box();
		b1.getdata();
		b2.getdata();
		b3=b1.sum(b2);
		b3.display();	
	}
}