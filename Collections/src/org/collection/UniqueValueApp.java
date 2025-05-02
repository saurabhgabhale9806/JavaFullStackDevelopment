package org.collection;
import java.util.*;

public class UniqueValueApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the values: ");
        int size = sc.nextInt();
        Vector<Integer> v = new Vector<>(size);
        
        System.out.println("Enter the values: ");
        for (int i = 0; i < size; i++) {
            v.add(sc.nextInt());
        }
        
        // Loop to find unique values
        for (int i = 0; i < v.size(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < v.size(); j++) {
                if (i != j && v.get(i).equals(v.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(v.get(i));
            }
        }
     
    }
}
