package Q1;
import java.util.*;
public class MergeVetorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		Vector v = new Vector(size);
		
		for(int i = 0; i < size;i++) {
			v.add(sc.nextInt());
		}
		
		System.out.println("Enter the size: ");
		int size1 = sc.nextInt();
		
		Vector v1 = new Vector(size1);
		
		for(int i = 0; i < size1;i++) {
			v1.add(sc.nextInt());
		}
		
		Vector v2 = new Vector(size + size1);
		
		int k = 0;
		for(int i = 0 ; i < v.size();i++) {
			v2.add(v.get(i));
		}
		for(int i = 0 ; i < v1.size();i++) {
			v2.add(v1.get(i));
		}
		for(int i = 0; i < v2.size();i++) {
			System.out.print(v2.get(i)+" ");
		}
	}

}
