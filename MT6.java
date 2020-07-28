//multiple child
class A extends Thread{
	public void run(){
		while(true){
			System.out.println("Hello");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run(){
		while(true){
			System.out.println("World");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class MythreadTest{
	public static void main(String args[])throws InterruptedException{
		A a1=new A();
		a1.start();
		B b1=new B();
		b1.start();
		while(true)
		{
			System.out.println("Dinesh");
			Thread.sleep(3000);
		}
	}
}