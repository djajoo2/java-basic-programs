// method overloading of addition

class MyMath{
	int sum(int x,int y){
		return x+y;
	}
	float sum(float x,float y){
		return x+y;
	}
	public static void main(String args[])
	{
		MyMath m1=new MyMath();
		System.out.println(m1.sum(5,6));
		System.out.println(m1.sum(5.0f,6.0f));
	}
}