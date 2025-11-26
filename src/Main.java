import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * Returns the input name as a string.
     *
     * @param name the name to be returned
     * @return the input name
     */
    public static String greet(String name) {
        return name;  // Simply return the name
    }

    /**
     * Adds two integers and returns their sum.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
        return a + b;  // Return the sum of the two numbers
    }

    /**
     * Checks if a number is even.
     *
     * @param number
     * @return true if number is even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;  // Check if the number is divisible by 2
    }

    /**
     * Calculates the area of a circle with a given radius.
     *
     * @param radius
     * @return the area of the circle
     */
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;  // Area of a circle: π * r^2
    }

    /**
     * Grades a student based on their score.
     * 90 - A
     * 80 - B
     * 70 - C
     * 60 - D
     * otherwise - F
     *
     * @param score
     * @return the grade as a string
     */
    public static String grade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";  // Return corresponding grade based on score
    }

    /**
     * Returns the maximum of three numbers.
     *
     * @param a
     * @param b
     * @param c
     * @return the maximum number
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));  // Use Math.max to find the max of three numbers
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius
     * @return the temperature in Fahrenheit
     */
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;  // Formula to convert Celsius to Fahrenheit
    }

    /**
     * Applies a discount to a price.
     *
     * @param price
     * @param discount
     * @return the price after applying the discount
     */
    public static double applyDiscount(double price, double discount) {
        return price * (1 - discount / 100);  // Apply discount to price
    }

    /**
     * Find even numbers from a list.
     *
     * @param numbers
     * @return a list of even numbers
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(Main::isEven).collect(Collectors.toList());  // Filter even numbers using streams
    }

    /**
     * Calculates factorial of a number.
     *
     * @param n
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) return 1;  // Base case: 0! = 1
        return n * factorial(n - 1);  // Recursively calculate factorial
    }

    /**
     * Calculates fibonacci number.
     *
     * @param n
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;  // Base cases: Fibonacci(0) = 0, Fibonacci(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursively calculate Fibonacci number
    }

    // ================= TEST RUNNER =================

    public static void main(String[] args) {
        System.out.println("🔍 Running Java Version Tests...\n");

        int passed = 0, failed = 0;

        passed += check("greet Alice", greet("Alice").equals("Alice"));
        passed += check("add", add(3, 5) == 8);
        passed += check("isEven true", isEven(4));
        passed += check("areaOfCircle", Math.abs(areaOfCircle(2) - 12.57) < 0.02);
        passed += check("grade A", grade(95).equals("A"));
        passed += check("maxOfThree", maxOfThree(3, 9, 6) == 9);
        passed += check("toFahrenheit", Math.abs(toFahrenheit(20) - 68) < 0.1);
        passed += check("discount", Math.abs(applyDiscount(100, 10)) == 90);
        passed += check("filterEvenNumbers",
                filterEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)).equals(Arrays.asList(2, 4, 6)));
        passed += check("factorial", factorial(5) == 120);
        passed += check("fibonacci", fibonacci(6) == 8);

        System.out.println("\n🎯 Tests passed: " + passed + " / 15");
    }

    private static int check(String name, boolean result) {
        if (result) {
            System.out.println("✅ " + name);
            return 1;
        } else {
            System.out.println("❌ " + name);
            return 0;
        }
    }
}