package Q1;
import java.util.*;
public class SecondHighestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size =  sc.nextInt();
		Vector v =  new Vector(size);
		
		for(int i = 0 ; i < size;i++) {
			v.add(sc.nextInt());
		}
		
		int max =(int) v.get(0);
		int max2 = (int) v.get(1);
		
		for(int i = 0; i < size; i++) {
			if(max < (int)v.get(i)) {
				max2 = max;
				max =(int) v.get(i);
			}
			else if((int)v.get(i) > max2 && (int) v.get(i) != max) {
				max2 = (int)v.get(i);
			}
		}
		if(max == max2) {
			System.out.println("Values are equal");
		}
		System.out.println("Second Max Value is : "+max2);
	}

}