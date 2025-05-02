package org.Date13_03_2025;
import java.util.*;

public class JobManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
       

        do {
            System.out.println("\nPrint Job Management System");
            System.out.println("1: Submit a Print Job");
            System.out.println("2: Process Print a Job");
            System.out.println("3: View Pending Print Jobs");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the document to print: ");
                    String job = sc.nextLine();
                    queue.offer(job);
                    System.out.println("Print job " + job +  " added to the queue.");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No print jobs in the queue.");
                    } else {
                        System.out.println("Printing job: " + queue.poll());
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("No pending print jobs.");
                    } else {
                        System.out.println("Pending Print Jobs:");
                        for (String printJob : queue) {
                            System.out.println(printJob);
                            
                            
                            
                            
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting code...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);

    }
}
