package org.handling;
import java.util.*;
import java.io.*;



class Employee implements Serializable
{
   private int id;
   private String name;
   private int sal;
   
   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
      return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal(){
      return sal;
   }  
}
public class DeserializationApp
{
    public static void main(String x[])throws Exception
	{
    	 File f=new File("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\NewEmp.txt");
    	 if(!f.exists())
    	 {
    		 System.out.println("File is not found");
    	 }
    	try(FileInputStream fin = new FileInputStream("D:\\Saurabh JAVA Full  Stack Developer\\Core Java\\File Handling\\NewEmp.txt");
				 ObjectInputStream oin=new ObjectInputStream(fin))
    	
    	{
		 
		 //Object obj=oin.readObject();
		 Employee e=(Employee)oin.readObject();
		 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  //oin.close();
		  //fin.close();
    	}
    	catch(Exception ex)
    	{
    		System.out.println("error is:"+ex);
    	}
	}
}