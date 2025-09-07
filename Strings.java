public class Strings{
	public static void main (String args[]){
		C c = new C();
		C c1 = new C();
	}
}

class C {
 static int a = 0;
 C(){
    a++;
	System.out.println(a);
 }
}