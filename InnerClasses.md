class Test{
	public static void main(String[] args){
		Test1 t1 = new Test1();
		Test1.Test2 t2 = t1.new Test2();
	}
}

class Test1{
	class Test2{
		Test2(){
			System.out.println("Inner Class");
		}
	}
	Test1(){
		System.out.println("Outer class");
	}
}
