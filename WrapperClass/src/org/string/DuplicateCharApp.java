package org.string;
import java.util.Scanner;

public class DuplicateCharApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        char[] ch = str.toCharArray();
        boolean[] seen = new boolean[256]; 
        char[] c = new char[ch.length];
        int k = 0;

        for (int i = 0; i < ch.length; i++) {
            if (!seen[ch[i]]) { 
                seen[ch[i]] = true;
                c[k++] = ch[i];
            }
        }

        System.out.println( new String(c, 0, k));
    }
}
