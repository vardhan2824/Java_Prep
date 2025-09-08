// By implementing the runnable interface
class Threading {
	public static void main(String[] args){
		Threading1 t = new Threading1();
		Thread thread = new Thread(t);
		thread.run();
		if (thread.isAlive()){
			System.out.println("The Thread is waiting");
		}
		//t.start();
	}
	
}

class Threading1 implements Runnable {
	public void run(){
		System.out.println("The Thread is Running");
	}
}
