package org.string;
import java.util.*;
public class Encodingspace{
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the String: ");
        String str= sc.nextLine();
        
        char[] chars = str.toCharArray();
        int count = 0;
        
        for (char c : chars) {
            if (c == ' ') {
            	count++;
            }
        }
        
        char[] ch = new char[chars.length + count * 2];

        int k = 0;
        
        for (char c : chars) {
            if (c == ' ') {
                ch[k++] = '%';
                ch[k++] = '2';
                ch[k++] = '0';
            } 
            else {
                ch[k++] = c;
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Encoded: " + new String(ch));
    }
}
