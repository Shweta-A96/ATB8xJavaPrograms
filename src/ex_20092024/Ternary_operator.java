package ex_20092024;

public class Ternary_operator {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 45;
        //condition ? expression if true : expression if false
        int max = (a>b && b>c) ? a : b;
        int min = (a<b && b<c) ? a : c;
        System.out.println(max);
        System.out.println(min);

    }
}
