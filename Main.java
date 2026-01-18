public class Main{
	public static void main(String args[])
	{
		/* long comment starts and ends*/
		/*Identifier Rules:
		.Names can contain letters, digits, underscores, and dollar signs
		.Names must begin with a letter
		.Names should start with a lowercase letter, and cannot contain whitespace
		.Names can also begin with $ and _
		.Names are case-sensitive ("myVar" and "myvar" are different variables)
		.Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		*/
		//System.out.println("Hello World!");
		String name = "John";
		//System.out.println(name);
		int a,_a1,$a2;
		final int a3 = 20;
		a = _a1 = $a2 =10;
		float b = 5.99f;
		char c = 'c';
		boolean d = false;
		System.out.println(a + _a1 + $a2);
		System.out.println("This is final int type -> " + a3);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(name);
	}
}