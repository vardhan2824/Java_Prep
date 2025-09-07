public class PrintingDemo {
    public static void main(String[] args) {
        // Different data types
        String name = "Alice";
        int age = 25;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;

        // ---- Using println (concatenation) ----
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Value of pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);

        // ---- Using printf (format specifiers) ---- //%n for line break
        System.out.printf("Name: %s%n", name);      // %s for String
        System.out.printf("Age: %d%n", age);        // %d for int
        System.out.printf("Value of pi: %.2f%n", pi); // %f for float/double
        System.out.printf("Grade: %c%n", grade);    // %c for char
        System.out.printf("Is Java fun? %b%n", isJavaFun); // %b for boolean

        // ---- Multiple values together ----
        System.out.printf("%s is %d years old, got grade %c, loves Java: %b, and knows pi ≈ %.3f%n",
                          name, age, grade, isJavaFun, pi);
    }
}
