package com.company.learning.java.features.resourcemanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author mohanarao_sv
 *
 */
public class ResourceManagementInJava7 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("README"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}