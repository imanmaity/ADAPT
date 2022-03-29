import java.util.*;
import java.util.Scanner;

public class maximum_sum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,flag=0,se=0,so=0;
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
        }
        else{
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("invalid input");
            }
            else{
                for(int i=0;i<n;i++){
                    if(arr[i]%2==0){
                        se=se+arr[i];
                    }
                    else{
                        so=so+arr[i];
                    }
                }
            }
            if(se>so){
                System.out.println(se);
            }
            else{
                System.out.println(se);
            }
        }
    }
}