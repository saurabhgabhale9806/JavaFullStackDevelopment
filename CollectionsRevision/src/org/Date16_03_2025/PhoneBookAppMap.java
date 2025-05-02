/*6. Implement a Simple Phonebook Using Map
Write a program that implements a simple phonebook system. Store names as keys and phone numbers as values using a
 Map<String, String>. Provide methods to add, remove, and lookup a phone number.
Example:
Input: add("Alice", "1234567890");
Output: {"Alice": "1234567890"}
*/
package org.Date16_03_2025;

import java.util.*;

public class PhoneBookAppMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        

        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Lookup Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    map.put(name, phone);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Name to Remove: ");
                    String removeName = sc.nextLine();
                    if (map.remove(removeName) != null) {
                        System.out.println("Contact removed successfully!");
                    }
                    else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter Name to Lookup: ");
                    String look = sc.nextLine();
                    if (map.containsKey(look)) {
                        System.out.println("Phone Number: " + map.get(look));
                    } 
                    else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: 
                    if (map.isEmpty()) {
                        System.out.println("Phonebook is empty.");
                    } 
                    else {
                        System.out.println("\nPhoneBook Entries:");
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;

                case 5: 
                    System.out.println("Exiting Code...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (true);
    }
}
