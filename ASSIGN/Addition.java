import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();
        int c=(a+b);
        System.out.println("Addition of a and b = "+c);
    }
}
