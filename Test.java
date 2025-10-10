class Test extends Thread{
	public static void main(String args[]){
		// Test t1 = new Test();
		Testing r2 = new Testing();
		Thread t2 = new Thread(r2);
		// t1.start();
		// t2.start();
		t2.setName("Second Thread");
		t2.start();
		System.out.println(Thread.currentThread()+" "+t2.getName());
		//t1.join();
	}
	public void run(){
		System.out.println("Thread Running");
	}
}

class Testing implements Runnable{
	 public void run(){
		for(int i = 0;i < 4;i++){
			System.out.println(i);
		}
	}
}