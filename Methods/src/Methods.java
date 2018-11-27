/* Simple Methods Project
 *
 * Complete each of the puzzles, 1-20.
 * Assure each function works correctly by running the program.
 * HINT: You will have to call each method from the main method in order to test them. 
 * 
 * To submit, zip the .java file and email it to Mr. Stout
 * Your program will be auto graded. Make sure you do not change any of the function signatures. 
 * 
 * Things of importance are marked with TODO.
 * Good luck!
 */


public class Methods {
	public static void main(String[] args) {
		// Write your own tests to check if the function works properly
	}

	// Puzzle 1
	/* TODO : Returns two raised to a power.
	 * ------PARAMETERS------
	 * int exponent : A power to raise 2 to.
	 * 		exponent >= 0
	 * ------RETURN VALUES------
	 * RETURN 2 to the power of exponent.
	 */
	public static int powerOfTwo(int exponent) {

		return -1; // Default return statement, delete.
	}
	// Puzzle 2
	/* TODO : Returns the word "Alarm\n" repeated several times.
	 * ------PARAMETERS------
	 * int repeat : How many times to repeat "Alarm\n"
	 * 		repeat > 0
	 * ------RETURN VALUES------
	 * RETURN "Alarm\n" repeated repeat times in a single String.
	 */
	public static String alarm(int repeat) {
		
		return ""; // Default return statement, delete.
	}
	// Puzzle 3
	/* TODO : Sums and returns the numbers 1 to 100.
	 * ------RETURN VALUES------
	 * RETURN the sum of numbers 1 to 100, inclusive.
	 */
	public static int sum100() {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 4
	/* TODO : Sums and returns the numbers in a range.
	 * ------PARAMETERS------
	 * int begin : The number to start adding from.
	 * int end : The number to stop adding at (include it in the sum).
	 * 		end > begin
	 * ------RETURN VALUES------
	 * RETURN the sum of numbers between begin and end.
	 */
	public static int sumRange(int begin, int end)	{
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 5
	/* TODO : Returns the larger of two integers.
	 * ------PARAMETERS------
	 * int a, b : An integer to compare.
	 * ------RETURN VALUES------
	 * RETURN the larger of a and b.
	 */
	public static int maxOfTwo(int a, int b) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 6
	/* TODO : Returns the larger of two doubles.
	 * ------PARAMETERS------
	 * double a, b : A double to compare.
	 * ------RETURN VALUES------
	 * RETURN the larger of a and b.
	 */
	public static boolean larger(double a, double b){
		
		return false; // Default return statement, delete.
	}
	// Puzzle 7
	/* TODO : Counts all the As in a String.
	 * ------PARAMETERS------
	 * String str : A String to process.
	 * ------RETURN VALUES------
	 * RETURN the amount of As in str.
	 */
	public static int countA(String str) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 8
	/* TODO : Returns if two numbers are evenly divisible.
	 * ------PARAMETERS------
	 * int a ,b : A number to compare.
	 * ------RETURN VALUES------
	 * IF a is divisible by b,
	 * 		OR b is divisible by a,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public static boolean evenlyDivisible(int a, int b){
		
		return false; // Default return statement, delete.
	}
	// Puzzle 9
	/* TODO : Returns the average of three numbers.
	 * ------PARAMETERS------
	 * int a, b, c : A number to average.
	 * ------RETURN VALUES------
	 * RETURN the average of a, b, c as a double.
	 */
	public static double average(int a, int b, int c) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 10
	/* TODO : Returns the average of three numbers.
	* ------PARAMETERS------
	* int a, b, c, d : A number to average.
	* ------RETURN VALUES------
	* RETURN the average of a, b, c, d as a double.
	*/
	public static double average(int a, int b, int c, int d) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 11
	/* TODO : Returns the average of three numbers.
	* ------PARAMETERS------
	* int a, b, c, d, e : A number to average.
	* ------RETURN VALUES------
	* RETURN the average of a, b, c, d, e as a double.
	*/
	public static double average(int a, int b, int c, int d, int e) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 12
	/* TODO : Concatenates a String to itself several times and returns it.
	 * ------PARAMETERS------
	 * String str : A String to concatenate.
	 * int copy : How many times to concatenate the String (1 = return original, 2 = concatenate 1 time, etc.).
	 * 		copy > 0
	 * ------RETURN VALUES------
	 * RETURN str concatenated to itself the correct amount of times.
	 */
	public static String multiConcat(String str, int copy) {
		
		return ""; // Default return statement, delete.
	}
	// Puzzle 13
	/* TODO : Overload for multiConcat(String,int) that defaults to 1 concatenation.
	 * USES: multiConcat(String, int)
	 * ------PARAMETERS------
	 * String str : A String to concatenate.
	 * ------RETURN VALUES------
	 * RETURN str concatenated to itself one time.
	 */
	public static String multiConcat(String str) {
		
		return ""; // Default return statement, delete.
	}
	// Puzzle 14
	/* TODO : Returns if the first letter of a String is a letter.
	 * ------PARAMETERS------
	 * String str : A String to evaluate
	 * 		str.length >= 1
	 * ------RETURN VALUES------
	 * IF the first character of str is any letter, capital or lowercase,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public static boolean isAlpha(String str) {
		
		return false; // Default return statement, delete.
	}
	// Puzzle 15
	/* TODO : Returns a number between two other numbers that the user supplies.
	 * If the intial value is not between min and max, ask the user for another val
	 * 	until the provided number is within the range (or equal to either bound).
	 * ------PARAMETERS------
	 * int min : The lowest acceptable value.
	 * int max : The highest acceptable value.
	 * 		max > min
	 * int val : The intial value to evaluate.
	 * ------RETURN VALUES------
	 * IF the provided val is between min and max,
	 * 		RETURN val.
	 * ELSE
	 * 		Ask the user for a new val and reevaluate.
	 */
	public static int validate(int min, int max, int val) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 16
	/* TODO : Returns if two doubles are essentially equal based on an allowed difference.
	 * ------PARAMETERS------
	 * double a, b : A double to compare.
	 * double tolerance : A maximum permitted distance between a and b.
	 * 		tolerance >= 0
	 * ------RETURN VALUES------
	 * IF the difference between a and b is less than or equal to tolerance
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public static boolean floatEquals(double a, double b, double tolerance) {
		
		return false; // Default return statement, delete.
	}
	// Puzzle 17
	/* TODO : Returns a given string backwards.
	 * ------PARAMETERS------
	 * String str : A string to reverse.
	 * 		str.length >= 1
	 * ------RETURN VALUES------
	 * RETURN str with its characters reversed.
	 */
	public static String reverse(String str) {
		
		return ""; // Default return statement, delete.
	}
	// Puzzle 18
	/* TODO : Returns if a triangle with given sides is isosceles but not equilateral.
	 * ------PARAMETERS------
	 * int side1, side2, side3 : A side of a triangle.
	 * 		side1, side2, side3 >= 1
	 * ------RETURN VALUES------
	 * IF any two sides are equal
	 * 		AND all three sides are not equal,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public static boolean isosceles(int side1, int side2, int side3) {
		
		return false; // Default return statement, delete.
	}
	// Puzzle 19
	/* TODO : Generates a random number between two given numbers and returns it.
	 * ------PARAMETERS------
	 * int min : The minimum possible value (inclusive) to return.
	 * int max : The maximum possible value (exclusive) to return.
	 * 		max > min
	 * ------RETURN VALUES------
	 * RETURN a random number between min and max.
	 */
	public static int randomInRange(int min, int max) {
		
		return -1; // Default return statement, delete.
	}
	// Puzzle 20
	/* TODO : Overloads randomInRange, assuming min is 1.
	 * USES: randomInRange(int, int)
	 * ------PARAMETERS------
	 * int max : The maximum possible value (exclusive) to return.
	 * 		max > 1
	 * ------RETURN VALUES------
	 * RETURN a random number between 1 and max.
	 */
	public static int randomInRange(int max) {
		
		return -1; // Default return statement, delete.
	}
}
