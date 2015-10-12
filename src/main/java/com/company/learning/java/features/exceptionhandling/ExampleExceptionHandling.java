package com.company.learning.java.features.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleExceptionHandling {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
            Date date = format.parse(line);
            System.out.println("Today's Date : " + date);
        } catch (ParseException exception) {
            // handle passing in the wrong type of URL.
            // logger.log(e);
        } catch (IOException exception) {
            // handle I/O problems.
            // logger.log(e);
        }
    }
}