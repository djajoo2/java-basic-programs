//through runnable class
class Mythread implements Runnable{
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

class MythreadTest{
	public static void main(String args[])throws InterruptedException{
		Mythread m1=new Mythread();
		Thread t1=new Thread(m1);
		t1.start();
		while(true){
			System.out.println("Bye");
			Thread.sleep(2000);
		}
	}
}