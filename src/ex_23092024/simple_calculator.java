package ex_23092024;

public class simple_calculator {
    public static void main(String[] args)
    {
        int a = 2;
        int b = 5;
        char ch = '+';
        switch(ch)
        {
            case '+':
                 System.out.println(a+b);
                 break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("don't know which operation to perform");
                break;



        }
    }
}
