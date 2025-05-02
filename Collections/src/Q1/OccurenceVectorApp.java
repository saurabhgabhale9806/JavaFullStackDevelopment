/*Q1. WAP to create Vector and find the occurrence of elements in Vector?
*/

package Q1;

import java.util.*;
public class OccurenceVectorApp{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=xyz.nextInt();
		
		Vector v = new Vector(size);
		
		System.out.println("Enter the values");
		for(int i = 0; i < size;i++)
		{
			int no = xyz.nextInt();
			v.add(no);
		}
		
		
		for(int i = 0;i < v.size();i++)
		{
			int count=1;
			for(int j = i + 1;j < v.size();j++)
			{
				if(v.get(i).equals(v.get(j)))
				{
					count++;
					v.set(j,-1);
				}
			}
			
			if(count > 0 && (int)v.get(i) != -1)
			{
				System.out.println(v.get(i)+"---->"+count);
			}
		}
		
	}
}