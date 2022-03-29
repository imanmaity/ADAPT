//Book and Author

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

class Book {
    String isbn; 
    String name; 
    Author author[]; 
    double price;
    int qty=0;

    public Book(String isbn,String name,Author author[],double price,int qty)
    { 
        super(); 
        this.isbn=isbn; 
        this.name=name; 
        this.author=author; 
        this.price=price; 
        this.qty=qty;
}
public Book(String isbn,String name,Author author[],double price)
    { 
        super(); 
        this.isbn=isbn; 
        this.name=name; 
        this.author=author;
        this.price=price; 
    }
public String getIsbn()
    { 
        return isbn; 
    } 
    public void setIsbn(String isbn)
    { 
        this.isbn=isbn; 
    }
     public String getName()
     { 
         return name; 
        } 
    public void setName(String name)
    { 
        this.name=name; 
    } 
    public Author[] getAuthor()
    { 
        return author; 
    } 
    public void setAuthor(Author author[])
    {
         this.author=author; 
    } 
    public double getPrice()
    {
         return price; 
        } 
    public void setPrice(double price)
    {
         this.price=price; 
        } 
    public int getQty()
    {
         return qty;
     } 
    public void setQty(int qty)
    { 
        this.qty=qty; 
    }

@Override
public String toString()
    { 
        return "Book[isbn=" + isbn+",name="+name+",author="+Arrays.toString(author).replaceAll("\\s", "")+",price="+price+",qty="+qty+"]"; 
    }
}
class Author 
{ 
    Author(){ 

    } 
    String name; 
    String email; 
    public String getName()
    { 
        return name; 
    } 
    public void setName(String name)
    { 
        this.name=name; 
    } 
    public String getEmail() 
    { 
        return email; 
    } 
    public void setEmail(String email)
    { 
        this.email=email;
     } 
    public Author(String name,String email)
    {
         super(); this.name=name;
        this.email=email; 
    }

@Override 
    public String toString()
    { 
        return "Author[name="+name+",email="+email+"]"; 
    } 
}

public class Main{ 
    public static void main(String[] args) {
         Author[] authors=new Author[2]; 
         Scanner s=new Scanner(System.in); 

         for (int i=0;i<authors.length;i++) 
         { 
             authors[i]=new Author(); 
             authors[i].name=s.next(); 
             authors[i].email=s.next(); 
             authors[i]=new Author(authors[i].name,authors[i].email); 
            } 
        String bid=s.next(); 
        s.nextLine(); 
        String bname=s.nextLine(); 
        double price=s.nextDouble(); 
        int qty=s.nextInt(); 
        Book b=new Book(bid,bname,authors,price,qty); 
        System.out.println(b.toString()); 
    } 
}
