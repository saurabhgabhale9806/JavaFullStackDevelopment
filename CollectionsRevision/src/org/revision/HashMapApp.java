/*Case 5: HashMap Basic Operations
Create a HashMap to store key-value pairs, and perform operations such as insertion, deletion, and retrieval.
*/

package org.revision;
import java.util.*;
public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map map = new HashMap();
				do {
					System.out.println("case 1: Insertion");
					System.out.println("case 2: Deletion");
					System.out.println("case 3: retrival");
					System.out.println("case 4: Exit code..");
					
					System.out.println("Enter your choice: ");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Enter the values in Map");
						
						for(int i = 0; i < 5; i++) {
							int k = sc.nextInt();
							String v = sc.nextLine();
							map.put(k,v);
						}
						
						break;
					case 2:
						if(map.isEmpty()) {
							System.out.println("Add Elements in hashMap");
						}
						else {
							System.out.println("Enter the key to delete element: ");
							int n = sc.nextInt();
							map.remove(n);
						}
						break;
					case 3:
						Set<Map.Entry> set = map.entrySet();
						for(Map.Entry m : set) {
							System.out.println(m.getKey() + "\t" + m.getValue());
						}
						
						break;
					case 4:
						System.out.println("Exiting code....");
						System.exit(0);
						break;
						default:
							System.out.println("Enter Valid choice: ");
					}
				}while(true);
	}

}
