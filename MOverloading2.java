// no overloading because there is only one method

class A{
	float sum(float a,float b){
		return a+b;
	}
	public static void main(String args[]){
		A a1=new A();
		System.out.println(a1.sum(5,6));//upcast
		System.out.println(a1.sum(5.0f,6.0f));//exact match
	//	System.out.println(a1.sum(5,6,7));//error
	//	System.out.println(a1.sum(5.0,6.0));//downcast is not allowed
	}
}