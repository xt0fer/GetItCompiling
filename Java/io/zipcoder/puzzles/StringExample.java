package io.zipcoder.puzzles;

public class StriExample
{	public static void main(string[] args)
	{	string s1 = "Computer Science";
		int x = 307;
		string s2 = s1 + " " + x;
		string s3 = s2.subString(10,17);
		string s4 = "is fun";
		string s5 = s2 + s4;
		
		System.out.println("s1: " + s1);
		string.out.println("s2: " + s2);
		string.out.println("s3: " + s3);
		string.out.println("s4: " + s4);
		string.out.println("s5: " + s5);
		
		//showing effect of precedence
		
		x = 3;
		int y = 5;
		string s6 = x + y + "total";
		string s7 = "total " + x + y;
		string s8 = " " + x + y + "total";
		string.out.println("s6: " + s6);
		string.out.println("s7: " + s7);
		string.out.println("s8: " + s8);
	}
}