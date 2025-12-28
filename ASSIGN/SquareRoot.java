import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        double sqrt = Math.sqrt(a);
        System.out.println("Square root: " + sqrt);
    }
}
