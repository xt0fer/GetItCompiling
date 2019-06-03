package io.zipcoder.puzzles;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLExpSimple {

    
    public static void main(string[] ) {
        try {
            URL mySite = new URL("http://google.com");
            URLConnection yc = mySite.openConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                coun++;
            }
            System.out.println("Number of tokens: " + nt);
            IN.Close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
