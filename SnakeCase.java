import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class SnakeCase {
    public String camelToSnake(String str){
        String snake = (Character.toString(str.charAt(0))).toLowerCase();
        String aa;
        for(int i=1; i<str.length(); i++){
            char a = str.charAt(i);
            
            if(Character.isUppperCase(a)){
                snake += "_";
                aa = (Character.toString(a)).toLowerCase();
                snake += aa;
            }else{
                aa = (Character.toString(a));
                snake += aa;
            }
            }
            return snake;
        }
    }
public class Source{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SnakeCase scase = new SnakeCase();
        System.out.println(scase.camelToSnake(str));
    }
}
