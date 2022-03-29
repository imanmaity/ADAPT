import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private String college;
    Student(int i,String n,String c)
    {
        studentId=i;
        studentName=n;
        college=c;
    }
    

    public void setStudentId(int i)
    {
        studentId=i;
    }
     public void setStudentName(String n)
    {
        studentName=n;
    }
     public void setCollege(String c)
    {
        college=c;
    }
     public int getStudentId()
     {
         return studentId;
     }
      public String getStudentName()
     {
         return studentName;
     }
      public String getCollege()
     {
         return college;
     }
    public void getDetails(){

    System.out.println("Student ID:"+" "+studentId);
    System.out.println("Student Name:"+" "+studentName);
    System.out.println("College:"+" "+college);
    
    }
   }
   
   class EngineeringStudent extends Student{
       private String stream;
       
       public void setStream(String s)
       {
           stream=s;
       }
       public String getStream()
       {
           return stream;
       }
       EngineeringStudent(int i, String n, String c,String s)
       {
           super(i,n,c);
           stream=s;
       }
       public void getDetails()
       {
           super.getDetails();
           System.out.println("Stream: "+stream);
       }
   }
   public class Source {
    public static void main(String[] args)throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        String t =in.readLine();
        if(t.equalsIgnoreCase("EngineeringStudent"))
        {
            EngineeringStudent s=new EngineeringStudent(Integer.parseInt(in.readLine()), in.readLine(),in.readLine(),in.readLine());
            s.getDetails();
        }
        else if(t.equalsIgnoreCase("Student"))
        {
            Student s= new Student(Integer.parseInt(in.readLine()), in.readLine(), in.readLine());
            s.getDetails();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}
