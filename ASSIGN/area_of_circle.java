import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r=in.nextInt();
        
        double c=3.14*r*r;
        System.out.println("area of circle = "+c);
    }
}
