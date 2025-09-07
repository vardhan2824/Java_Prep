abstract class AbstractClass {
	
	abstract void display();
}

class First extends AbstractClass{
	int x = 10;
	 void display (){
		System.out.println(x);
		
	}
}

public class Abstract {
	public static void main(String[] args){
		First f = new First();
		f.display();
	}
}