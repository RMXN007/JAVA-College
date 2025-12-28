package GG.RamanJava;


import java.util.Scanner;

public class linearsearch {
    public static int linearsearch(int[] Arr, int key) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter numbers in array");
        for (int i = 0; i < n; i++) {
            Arr[i] = in.nextInt();
        }
        System.out.println("Enter key to find");
        int key = in.nextInt();
        int d = linearsearch(Arr, key);
        // System.out.println(Arr[d]);
        if (Arr[d] == key) {
            System.out.println(Arr[d]+"  key found in array");
        } else {
            System.out.println("not found");
        }
    }
}
