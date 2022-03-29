//Beauty parlor

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Customers {
    String name ; 
    public String getName() { 
        return name; 
    } 
    public void setName(String name) { 
        this.name=name; 
    } 
    public boolean isMemebr() { 
        return member; 
    } 
    public void setMember(boolean member) { 
        this.member=member; 
    }
    public String getMembertype() { 
        return membertype; 
    } 
    public void setMembertype(String membertype) 
    { 
        this.membertype=membertype; 
    } 
    boolean member; 
    String membertype; 
    Customers(String name) {
         this.name=name; 
        }
    public String toString() { 
        return "Customer [name=" + name + ", member=" + member + ", membertype=" + membertype + "]"; 
    }
}
class Visit { 
    String name; 
    Customers cust; 
    double serviceExpense; 
    double productExpense; 
    double totalExpense; 
    Visit(Customers cust) { 
        this.cust=cust; 
    }
    public String getName() { 
        return cust.getName(); 
    } 
    public double getServiceExpense() { 
        return serviceExpense; 
    } 
    public void setServiceExpense(double serviceExpense) { 
        this.serviceExpense=serviceExpense; 
    } 
    public double getProductExpense() {
         return productExpense; 
        } 
    public void setProductExpense(double productExpense) { 
        this.productExpense=productExpense; 
    } 
    public double totalExpense() { 
        double dis=0; double dis1=0; 
        if(cust.getMembertype().equals("null")) {
             return serviceExpense+productExpense; 
            } 
        else
        dis= serviceExpense * DiscountRate.getServiceDiscountRate(cust.getMembertype()); 
        dis1=productExpense*DiscountRate.proddiscount; 
        double prodiscount=productExpense-dis1; 
        double totalExpense1=serviceExpense-dis; 
        System.out.println( totalExpense1); 
        double totalExpense2=productExpense-dis1; 
        System.out.println( totalExpense2); 
        return totalExpense=totalExpense1 + totalExpense2;
    }
    public String toString() {
         return "[Customer Name:" + cust + "Service Expense:" + serviceExpense + "Discount:" + DiscountRate.getServiceDiscountRate(cust.getMembertype()) + "]"; 
        }
}

class DiscountRate { 
    static double premiumService=0.2; 
    static double goldService=0.15; 
    static double silverService=0.1; 
    static double prodsilverService=0.1; 
    static double prodgoldService=0.1; 
    static double prodpremiumService=0.1; 
    static double proddiscount=0.1;

    public static double getServiceDiscountRate(String service) { 
        if(service.equals("Premium")) {
             return premiumService; 
            } 
            else if(service.equals("Gold")) {
                 return goldService; 
                } 
                else if(service.equals("Silver")) {
                     return silverService; 
                    } 
                else if(service.equals("null")) { 
                    System.out.println("Not Qualified for any Discounts on Service/products"); 
                } 
            return 0; 
        }
    public static double getProductDiscountRate(String service) { 
        if(service.equals("Premium")) { 
            return prodpremiumService; 
        } 
        else if(service.equals("Gold")) {
             return prodgoldService;
        } 
        else if(service.equals("Silver")) {
             return prodsilverService; 
            } 
        else return 0; 
    }
}

public class Main {
     public static void main(String[] args) { 
         Scanner s=new Scanner(System.in);
        String name=s.next(); 
        boolean b=s.nextBoolean(); 
        String mtype=s.next(); 
        double serexp=s.nextDouble(); 
        double prodexp=s.nextDouble(); 
        Customers c=new Customers(name); 
        Visit v=new Visit(c); 
        c.setMember(b); 
        c.setMembertype(mtype); 
        v.setServiceExpense(serexp); 
        v.setProductExpense(prodexp); 
        DiscountRate.getServiceDiscountRate(c.getMembertype()); 
        System.out.println( c.getName()); 
        System.out.println( c.getMembertype()); 
        System.out.println( v.getServiceExpense()); 
        System.out.println( v.getProductExpense()); 
        System.out.println( v.totalExpense()); 
    } 
}