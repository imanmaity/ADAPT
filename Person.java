//Check 2 person same

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(); 
        int b=sc.nextInt(); 
        sc.nextLine(); 
        String c=sc.nextLine();
        char x=c.charAt(0); 
        String d=sc.nextLine(); 
        int e=sc.nextInt(); 
        sc.nextLine(); 
        String f=sc.nextLine(); 
        char y=f.charAt(0); 
        Person p1 = new Person(a,b,x); 
        Person p2 = new Person(d,e,y);

        if(p1.equals(p2)){
            System.out.println("Two Persons are same.");
        } 
            else{System.out.println("Two Persons are not same."); 
        }            
        } 
    } 
class Person{
    String name; 
    int age; 
    char gender; 

    public void setName(String name) 
    { 
        this.name = name; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public void setAge(int age) 
    { 
        this.age = age; 
    } 
    public int getAge() 
    { 
        return age;
    }
    public void setGender(char gender) 
    { 
        this.gender = gender; 
    } 
    public char getGender() 
    { 
        return gender; 
    } 
    public Person() {} 
    public Person(String name,int age, char gender) 
    {
        super(); 
        this.name = name; 
        this.age = age; 
        this.gender = gender; 
    }
    @Override public boolean equals(Object obj) 
    { 
        if(obj == null) 
            return false; 
        if(!(obj instanceof Person)) 
                return false; 
    Person other = (Person)obj; 
        if(!(this.name.equals(other.name))) 
                return false; 
        if(this.age != other.age) 
                return false; 
        if(this.gender != other.gender) 
            {
             return false; 
            } 
            return true; 
        }
}
    

