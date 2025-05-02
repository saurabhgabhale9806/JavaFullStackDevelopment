/*Q2. WAP to store 10 string values in Vector and search string whose length is more than three and ends with sh 
*/

package org.collection;
import java.util.*;
public class SearchStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the Vector: ");
        int size = sc.nextInt();
        sc.nextLine();

        Vector <String> v = new Vector<>(size);
        
        System.out.println("Enter the values in the Vector:");
        for (int i = 0; i < size; i++) {
            v.add(sc.nextLine());
        }

        boolean found = false;
        
        System.out.println("\nStrings that have more than three characters and end with 'sh':");
        for (String word : v) {
            if (word.length() > 3 && word.endsWith("sh")) {
                System.out.println("Word: " + word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching words found.");
        }

   
    }
}
