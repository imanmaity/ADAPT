import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class TriviaGame {
    public static int triviaMethod(String[] questions, String[] answers){
        String[] rAnswers = {
                    "OTTAWA",
                    "ROME",
                    "DELHI",
                    "50",
                    "CHINA"
        };

        int[] point = {2,3,2,3,5};
        int totalPoint = 0;

        for(int i=0; i<5; i++)
            if(answers[i].equalsIgnoreCase(rAnswers[i])){
                totalpoint+=point[i];
                System.out.println("Correct!");
            }else{
                System.out.println("Wrong Answer!");

            return totalPoint;
            }
        
    public static void main(String[] args)throws Exception{

        String[] questions = {
            "Question 1: What is the capitalof CANADA?",
            "Question 2: What is the capitalof ITALY?",
            "Question 3: What is the capitalof INDIA?",
            "Question 4: How many states are there in USA?",
            "Question 5: What is the largest population COUNTRY in the world?"
        };

        String[] answers = {
            "OTTAWA",
            "ROME",
            "DELHI",
            "50",
            "CHINA"
        };
        System.out.println("Final Score: "+triviaMethod(questions,answers));           
        }
    }
}

