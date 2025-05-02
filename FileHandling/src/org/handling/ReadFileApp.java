package org.handling;
import java.util.*;
import java.io.*;

public class ReadFileApp {
    public static void main(String[] args) {
        String filePath = "D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\MyDoc1.doc"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("File content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (Exception ex) {
            System.out.println("An error occurred while reading the file.");
           System.out.println("Error is: "+ex);
        }
    }
}

