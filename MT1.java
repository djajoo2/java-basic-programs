//Single Thread
class MyThreadTest1{	
	public static void main(String args[]){ 
		Thread t=Thread.currentThread();
		System.out.println("Name is " + t.getName());
		System.out.println("Priority is " + t.getPriority());
	  	System.out.println(t);  //toString()
	  	t.setName("Matrix Thread");
	  	t.setPriority(Thread.MAX_PRIORITY);
	  	System.out.println("Name is " + t.getName());
 		System.out.println("Priority is " + t.getPriority());
	  	System.out.println(t);  //toString()
	  	for(int i=1;i<=5;i++){	
			try{	
				Thread.sleep(3000);
			}
			catch(InterruptedException e){	
				System.out.println(e);
			}
			System.out.println("\t\t\t"+i);
	  	}
       }
}