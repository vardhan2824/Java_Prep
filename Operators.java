public class Operators{
	public static void main (String args[]){
		/* Operators in Java -> AARLUBTT */
		//Arithmetic Operators
		int x = 10;
		int y = 3;

		System.out.println(x + y); // 13
		System.out.println(x - y); // 7
		System.out.println(x * y); // 30
		System.out.println(x / y); // 3
		System.out.println(x % y); // 1

		int z = 5;
		++z;
		System.out.println(z); // 6
		z--;
		System.out.println(z); // 5
		
		//Assignment Operators
		x = 10;
		x += 5;
		
		//Comparison Operators(Relational)
		x = 5;
		y = 3;
		System.out.println(x > y); // returns true, because 5 is higher than 3
		x = 5;
		y = 3;
		System.out.println(x > y); // returns true, because 5 is higher than 3
		
		//Logical Operators -> boolean
		boolean isLoggedIn = true;
		boolean isAdmin = false;

		System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
		System.out.println("Has access: " + (isLoggedIn || isAdmin));
		System.out.println("Not logged in: " + (!isLoggedIn));
		
		
		
	}
}