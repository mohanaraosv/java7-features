package com.company.learning.java.features.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleExceptionHandlingNew {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
            Date date = format.parse(line);
            System.out.println("Today's Date : " + date);
        } catch (ParseException | IOException exception) {
            // handle our problems here.
            // logger.log(e);
        } catch (Exception exception) {
            // handle our problems here.
            // logger.severe(e);
        }
    }
}