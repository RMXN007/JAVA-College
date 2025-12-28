package RamanJava;


import java.util.Scanner;

public class pallindrom {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int sum=0;
        int temp=a;
        boolean b=false;
        // reverse
        while (temp!=0) {
            int digit=temp%10;
            sum=(sum*10)+digit;
            temp=temp/10;
        }
        if (sum==a) {
           b=true;  
        }else{
            b=false;
        }
        if (b) {
            System.out.println("Is pallindrom");
        }
        else{
            System.out.println("Not pallindrom");
        }
    }
}
