import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter first number");
        double a=in.nextInt();
        System.out.println("Enter second number");
        double b=in.nextInt();
        System.out.println("Enter opration to be performed");
        char r=in.next().charAt(0);
        switch (r) {
            case '+':
                System.out.println("Performing Addition");
                double c= a+b;
                System.out.println("Addition of a and b = "+c);
                break;
            case '-':
                System.out.println("Performing Substraction");
                double d=a-b;
                System.out.println("Substraction of a and b = "+d);
                break;
            case '*':
                System.out.println("Performing Multiplication");
                double e=a*b;
                System.out.println("multiplication of a and b = "+e);
                break;
            case '/':
                System.out.println("Performing division");
                double f=a/b;
                System.out.println("division of a by b = "+f);
                break;
            case '^':
                System.out.println("Performing power");
                double g=Math.pow(a, b);
                System.out.println("division of a to the power b = "+g);
                break;
            case 'r':
                System.out.println("Performing square root");
                double h=Math.sqrt(a);
                double z=Math.sqrt(b);
                System.out.println("square root of a = "+h);
                System.out.println("square root of b = "+z);
                break;
            default:
            System.out.println("INVALID OPRATION");
                break;
        }
    }
}
