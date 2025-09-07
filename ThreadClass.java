class ThreadClass extends Thread{
	public static void main(String[] args){
		ThreadClass t = new ThreadClass();
		t.start();
	}
	public void run(){
		System.out.println("The Thread is running under the Threadclass");
	}
}