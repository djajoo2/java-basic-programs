class Mythread extends Thread{
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
		Mythread t1=new Mythread();
		t1.start();
		while(true){
			System.out.println("Bye");
			Thread.sleep(2000);
		}
	}
}