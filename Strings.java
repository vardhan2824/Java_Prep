public class Strings{
	public static void main (String args[]){
		// C c = new C();
		// C c1 = new C();`
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The string is: "+txt);
		
		System.out.println("The length of the txt string is: " + txt.length());
		
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		txt = "Hello";
		System.out.println(txt.charAt(0));  // H
		System.out.println(txt.charAt(4));  // o
		
		//Comparing two Strings
		String txt1 = "Hello";
		String txt2 = "Hello";

		String txt3 = "Greetings";
		String txt4 = "Great things";

		System.out.println(txt1.equals(txt2));  // true
		System.out.println(txt3.equals(txt4));  // false
		
		txt = "   Hello World   ";
		System.out.println("Before: [" + txt + "]");
		System.out.println("After:  [" + txt.trim() + "]");
		
		//concat() method
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		String a = "Java ";
		String b = "is ";
		String c = "fun!";
		String result = a.concat(b).concat(c);
		System.out.println(result);
		
		String x = "10";
		int y = 20;
		String z = x + y;  // z will be 1020 (a String)
		System.out.printf("%s%n",z);
		
		//inserting the special character's in the string
		// \n	New Line	
		// \r	Carriage Return	
		// \t	Tab	
		// \b	Backspace	
		// \f	Form Feed
		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
	}
	
}

// class C {
 // static int a = 0;
 // C(){
    // a++;
	// System.out.println(a);
 // }
// }