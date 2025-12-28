import java.util.Scanner;
public class Swap {
    public static void swapp(int a,int b){
        int temp=a;a=b;b=temp;
        System.out.println("After swap a = "+a+" and b = "+b);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();
        System.out.println("Before swap a = "+a+" and b = "+b);
        swapp(a,b);
    }
}
