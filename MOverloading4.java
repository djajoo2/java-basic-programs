class A{
	float sum(int a,int b){
		return a+b;
	}
	float sum(float a,float b){
		System.out.println("Hi");
		return a+b;
	}

	public static void main(String args[]){
		A a1=new A();
		System.out.println(a1.sum(5,6.0f));//it cannot downcast
	}
}