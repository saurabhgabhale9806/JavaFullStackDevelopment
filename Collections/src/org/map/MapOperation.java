/*Q1. WAP to perform following operation on map
   Case 1: add new value 
   Case 2: view all values using entrySet() method
   Case 3: View all values using keySet() method 
   Case 4: Search value from map using its key
   Case 5: delete value from map using its key
  Case 6: update value in map using its key 
  Case 7: search value using map using value
  Case 8:  show the all values using values() method */

package org.map;
import java.util.*;
public class MapOperation 
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   HashMap<Integer,String> map=new HashMap();
	   do
	   {
		 System.out.println("1.Add new Value:");
		 System.out.println("2.view all values using entrySet()method:");
		 System.out.println("3.view all values using keySet()method:");
		 System.out.println("4.Search value from map using its key:");
		 System.out.println("5.Delete value from map using its key:");
		 System.out.println("6.update value in map using its key:");
		 System.out.println("7.search value using map using value:");
		 System.out.println("8.show the all values using values()method:");
		 System.out.println("Enter your choice:");
		 int choice=sc.nextInt();
		 System.out.println("=============================");
		 
		 switch(choice)
		 {
		 case 1:
		 System.out.println("Enter the key:");
		 int key=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the value:");
		 String value=sc.nextLine();
		 map.put(key, value);
		 System.out.println("😍😍Entry Added!......😊");
		 System.out.println("==============================");
		 break;
		 
		 case 2:
		 System.out.println("Entries using entryset():"+map.entrySet());
		 break;
		 
		 case 3:
			 System.out.println("key using keyset():"+map.keySet());
			 break;
		 case 4:
			 System.out.println("Enter the search key:");
			 int searchkey=sc.nextInt();
			 if(map.containsKey(searchkey))
			 {
				 System.out.println("Value found:"+map.get(searchkey));
			 }
			 else
			 {
				 System.out.println("Key not Found!......");
			 }
			 break;
		 case 5:
			 System.out.println("Enter the key value delete......😒");
			 int deletekey=sc.nextInt();
			 if(map.containsKey(deletekey))
			 {
				 map.remove(deletekey);
				 System.out.println("Key is Delete.......😊");
			 }
			 else
			 {
				 System.out.println("key is not found...");
			 }
			 break;
			 
		 case 6:
			 System.out.println("Enter the Update:");
			 int update=sc.nextInt();
			 sc.nextLine();
			 if(map.containsKey(update))
			 {
				 System.out.println("Enter the new Value:");
				 String newvalue=sc.nextLine();
				 map.put(update, newvalue);
				 System.out.println("Value update");
			 }
			 else
			 {
				 System.out.println("Value is not update");
			 }
			 break;
		 case 7:
			 System.out.print("Enter the value to search: ");
             String searchValue = sc.nextLine();
             boolean found = false;
             for (Map.Entry<Integer,String> entry : map.entrySet()) {
                 if (entry.getValue().equals(searchValue)) {
                     System.out.println("Key for value '" + searchValue + "': " + entry.getKey());
                     found = true;
                     break;
                 }
             }
             if (!found) {
                 System.out.println(" Value not found!");
             }
			 
			 break;
		 case 8:
			 System.out.println("value:"+map.values());
			 break;
		 case 9:
			System.out.println("Existing program successful.............") ;
			break;
			default:
				System.out.println("invalid choice.......");
	   }
	   } while(true);
	}

}