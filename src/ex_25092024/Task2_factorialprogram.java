package ex_25092024;
import java.util.Scanner;
public class Task2_factorialprogram {
    public static void main(String[] args){
       int num = 5;
       int fact = 1;
       for(int i=1; i<=num; i++)
       {
           fact = fact * i;
       }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
