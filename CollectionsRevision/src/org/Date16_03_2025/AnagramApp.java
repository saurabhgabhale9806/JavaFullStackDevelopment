/*3. Check for Anagram Strings
Write a program that checks if two strings are anagrams of each other. Use a Map<Character, Integer> to track 
the frequency of each character in both strings.
Example:
Input: "listen", "silent"
Output: true
*/
package org.Date16_03_2025;

import java.util.*;

public class AnagramApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase(); 

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("No");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
        	map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("No");
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
            	map.remove(ch);
            }
        }

        if (map.isEmpty()) {
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
