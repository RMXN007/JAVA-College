import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int left = 0, right = arr.length - 1, mid;
        boolean found = false;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == key) { found = true; break; }
            else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
