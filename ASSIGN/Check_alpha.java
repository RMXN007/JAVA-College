import java.util.Scanner;
public class Check_alpha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an character");
        char ch=in.next().charAt(0);
        if(ch>='a' || ch>='A' && ch<='z' || ch<='Z'){
            System.out.println("IS ALPHABET");
        }
        else{System.out.println("is not an alphabet");}
        }
}