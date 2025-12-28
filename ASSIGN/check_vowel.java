import java.util.Scanner;
public class check_vowel {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char ch = in.next().charAt(0);
        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is a consonant.");
    }
}
