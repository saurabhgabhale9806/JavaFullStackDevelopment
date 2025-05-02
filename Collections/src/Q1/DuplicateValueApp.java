/*Q2. WAP to find the duplicate values from Vector?*/
package Q1;
import java.util.*;
public class DuplicateValueApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        
        Vector <Integer> v = new Vector<>(size);
        System.out.println("Enter the values: ");
        for (int i = 0; i < size; i++) {
            v.add(sc.nextInt());
        }

        System.out.println("Duplicate values: ");
        int a = 0;
        for (int i = 0; i < v.size(); i++) {
           int count = 0;
            for (int j = i; j < v.size(); j++) { 
                if (v.get(i) == (v.get(j))) {
                 count++;
                   
                }
            }
            if (count > 1 && a != v.get(i) ) {
            	a = v.get(i);
                System.out.println(v.get(i));
            }
            
            
        }
    }
}