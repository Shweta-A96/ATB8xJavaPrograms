package ex_18092024;

public class Task1_widening {
    public static void main(String[] args) {
        short b = 10;
        int a = b; // valid implicit
        int a1 = (int) b; // valid explicit
    }

}


