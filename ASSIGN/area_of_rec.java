import java.util.Scanner;
public class area_of_rec {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int a=in.nextInt();
        System.out.println("Enter width of rectangle");
        int b=in.nextInt();
        int c=a*b;
        System.out.println("area of rectangle = "+c);
    }
}
