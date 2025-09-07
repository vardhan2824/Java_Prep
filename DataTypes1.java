public class DataTypes1{

	public static void main (String args[]){
	
	int myNum = 5;               // Integer (whole number)
	float myFloatNum = 5.99f;    // Floating point number
	char myLetter = 'D';         // Character
	boolean myBool = true;       // Boolean
	String myText = "Hello";     // String
	
	// byte: 8-bit signed integer (-128 to 127)
	byte myByte = 100;

	// short: 16-bit signed integer (-32,768 to 32,767)
	short myShort = 10000;

	// int: 32-bit signed integer (-2^31 to 2^31-1)
	int myInt = 100000;

	// long: 64-bit signed integer (-2^63 to 2^63-1)
	long myLong = 10000000000L;  // Note the 'L' suffix

	// float: 32-bit single-precision floating point
	float myFloat = 3.14f;  // Note the 'f' suffix

	// double: 64-bit double-precision floating point
	double myDouble = 3.14159;  // Default for decimal literals
	
	boolean isJavaFun = true;
	boolean isFishTasty = false;
	System.out.println(isJavaFun);     // Outputs true
	System.out.println(isFishTasty);   // Outputs false
	
	char myVar1 = 65, myVar2 = 66, myVar3 = 67;
	System.out.println(myVar1);
	System.out.println(myVar2);
	System.out.println(myVar3);
	
	String greeting = "Hello World";
	System.out.println(greeting);
	
	// Create variables of different data types
	int items = 50;
	float costPerItem = 9.99f;
	float totalCost = items * costPerItem;
	char currency = '$';

	// Print variables
	System.out.println("Number of items: " + items);
	System.out.println("Cost per item: " + costPerItem + currency);
	System.out.println("Total cost = " + totalCost + currency);
	
	// Using of the Var datatype
	var myNum1 = 5;         // int
	var myDouble2 = 9.98;   // double
	var myChar = 'D';      // char
	var myBoolean = true;  // boolean
	var myString = "Hello"; // String
	
	System.out.println(myNum1 + " // This is a var Int variable");
	}

}