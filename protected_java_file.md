class Test1{
	protected  int i;
	protected void before(){
		System.out.println("The variable outside the method "+i);
	}
	protected int display(){
		i = 10; 
		//System.out.println(i);
		return i;
	}
	protected void show(){
		System.out.println("The variable outside the method "+i);
	}
}

public class Test extends Test1{
	public static void main(String[] args){
		Test t = new Test();
		t.before();
		System.out.println(t.display());
		t.show();
	}
}
