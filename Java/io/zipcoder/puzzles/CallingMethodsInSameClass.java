package io.zipcoder.puzzles;/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
      
      // Don't choose this one either. :-)
		printOne()
		printOne();
		printTwo()
	}

	public static void printOne() {
		System.out.println(Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne()
	}
}