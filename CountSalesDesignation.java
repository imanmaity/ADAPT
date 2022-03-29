import java.util.Scanner;
import java.io.*;
import java.util.*;

public class CountSalesDesignation {

        public static void main(String args[] ) throws Exception {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            if(n<1){
                System.out.println("INVALID INPUT");
            }
            else{
            String[] arr=new String[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextLine();
                if(arr[i].contains("Sales") || arr[i].contains("sales")){
                    count++;
                }
            }
            if(count>=1){
                System.out.println("Designations in Sales Department 2");
                
                for(int i=0;i<arr.length;i++){
                    if(arr[i].contains("Sales")){
                        System.out.println(arr[i]);
                    }
                }
            }
            else{
                System.out.println("No designations in Sales department");
            }
            
                
            }
            
        }
}
