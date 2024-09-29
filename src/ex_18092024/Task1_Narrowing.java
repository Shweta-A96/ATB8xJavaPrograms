package ex_18092024;

public class Task1_Narrowing {
    public static void main(String[] args) {
        //type casting
        byte d = 100;
        short b = d; // invalid implicit
        short b1 = (short) d; // invalid explicit
    }

}

