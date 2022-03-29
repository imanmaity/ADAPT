import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class IdentifyWords {
    public String getPossibleWords(String s1, String s2){
        String[] comp = s2.split(":");
        String finding = "";
        boolean t = false;
        int under = s1.indexOf("_");

        for(String a : comp){
            if(under < a.length()){
                char c = a.charAt(under);
            if((a.replace(c,'_')).equals(s1)){
                finding += a.toUpperCase()+":";
                t = true;
            }
            }
        }
        if(t){
            return finding.substring(0,finding.length()-1);
        }else{
            return "Code_Error";
        }
    }
}

public class Source{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.substring(0, s1.length()-2);
        s2 = s2.substring(1);
        IdentifyWords id = new IdentifyWords();
        System.out.println(id.getPossibleWords(s1, s2));

    }
}