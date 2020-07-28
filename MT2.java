class MyThread extends Thread{	
	public void run(){	
		System.out.println("Child Thread started");
		for(int i=1;i<=10;i++){	
			System.out.println("Child Thread " + i);
			try{
				Thread.sleep(50);				
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread stopped");
	}
}
class MyThreadTest2{	
	public static void main(String args[])throws InterruptedException{
		System.out.println("Main Thread started");
		MyThread t1=new MyThread();
		t1.start();
		for(int i=1;i<=10;i++){	
			Thread.sleep(49);
			System.out.println("Main Thread " + i);
		}
		System.out.println("Main Thread stopped");
   	}
}