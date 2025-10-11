import static java.lang.System.*;
import static java.lang.Runtime.*;

class Test1
{
	Test1(){
		out.println("Constructor");
	}
	Test1(int i){
		out.println("parameterised constructor");//Constructor Overloading
	}
	public static void main(String[] args){
		int i = 0;
		Test1 t = new Test1(i);
		out.println("static import!");
		out.println(t.hashCode());
		gc();
		getRuntime().gc();//Runtime
		out.println("Garbage collected");
	}
}