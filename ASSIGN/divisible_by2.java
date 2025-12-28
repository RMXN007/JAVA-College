import java.util.Scanner;

public class divisible_by2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any number");
        int r=in.nextInt();
        if(r%2==0 || r%3==0){
            System.out.println(r+ " IS DIVISIBLE BY 2 OR 3");
        }
        else{
            System.out.println("is not divisible by 2 or 3");
        }    
    }
}
