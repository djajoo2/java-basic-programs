// use of this keyword

class A{
	int x=5;
	void m1(){
		int x=10;
		System.out.println(this.x);
		System.out.println(x);
	}
}

class Hello{
	public static void main(String args []){
		A a1=new A();
		a1.m1();
	}
}