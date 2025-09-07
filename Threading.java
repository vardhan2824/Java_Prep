// By implementing the runnable interface
class Threading implements Runnable{
	public static void main(String[] args){
		Threading t = new Threading();
		Thread thread = new Thread(t);
		t.run();
		//t.start();
	}
	public void run(){
		System.out.println("Thread Running");
	}
}