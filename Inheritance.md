class Test{
	int i;
	double j;
	Test(int i ,int j){
		this.i = i;
		this.j = j;
	}
	void display(){
		System.out.println(i+" "+j);
	}
}

class Test1 extends Test{
	int k;
	Test1(int i,int j,int k){
		super(i,j);
		this.k =k;
	}
	void display(){
		super.display();
		System.out.println(k);
	}
	public static void main(String[] args){
		Test1 t = new Test1(10,20,30);
		t.display();
	}
}
		