package ex_20092024;

public class Fizz_Buzz {
    public static void main(String[] args) {

        int a = 30;
       if (a % 3 == 0 && a % 5 == 0) {
           System.out.println("fizzBuzz");
       }
        else if (a % 3 == 0) {
            System.out.println("fizz");
        } else if (a % 5 == 0) {
            System.out.println("Buzz");
        }

        }
    }

