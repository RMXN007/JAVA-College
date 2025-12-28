package GG.RamanJava;


import java.util.Scanner;

public class ram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // int temp = a;
        int num = a;
        double sum = 0;
        int count = 0;
        boolean arm = false;
        // while (temp != 0) {
        //     int d = temp % 10;
        //     count += 1;
        //     temp = temp / 10;
        // }
        count=String.valueOf(num).length();
        while (num != 0) {
            int d = num % 10;
            sum = (sum) + Math.pow(d,count);
            num = num / 10;
        }
        if (sum == a) {
            arm = true;
        } else {
            arm = false;
        }

        if (arm) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
}