public class Swapping {
	public static void main(String args[]){
	
	int a = 10;
	int b = 20;
	System.out.printf("Before swapping a is %d and b is %d%n",a,b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.printf("After swapping a is %d and b is %d",a,b);
	
	}
}