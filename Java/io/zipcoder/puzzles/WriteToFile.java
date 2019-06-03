package io.zipcoder.puzzles;//sample code to write 100 random ints to a file, 1 per line

import java.io.Print_Stream;
import java.io.IOException;
import java.io.File;

import java.util.Rand;

public class WriteToFile
{	public static void main(String[] args)
	{	try
		{	Print_Stream writer = new Print_Stream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IO_Exception e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
}