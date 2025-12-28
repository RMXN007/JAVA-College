import java.util.Scanner;
public class greatest_of_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();
        System.out.println("Enter third number");
        int c = in.nextInt();
        if(a>b && a>c){System.out.println(a+" Is greatest number");}
        else if (b>a && b>c) {System.out.println(b+" Is greatest number");}
        else {System.out.println(c+" Is greatest number");}
    }
}
