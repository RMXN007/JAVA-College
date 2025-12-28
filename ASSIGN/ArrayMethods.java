import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5};
        System.out.println(Arrays.toString(arr)); // [3, 1, 2, 5]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5]
        int idx = Arrays.binarySearch(arr, 3);
        System.out.println(idx); // 2
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.equals(arr, arr2)); // true
        Arrays.fill(arr2, 8);
        System.out.println(Arrays.toString(arr2)); // [8, 8, 8, 8]
    }
}
