
class A{
	float sum(float a,float b){
		System.out.println("Hello");
		return a+b;
	}
	long sum(long a,long b){
		return a+b;
	}
	public static void main(String args[]){
		A a1=new A();
		System.out.println(a1.sum(5,6));// it will call to same family group
	}
}