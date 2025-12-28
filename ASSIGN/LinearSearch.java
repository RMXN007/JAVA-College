public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 34, 50};
        int key = 34; boolean found = false;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) { found = true; break; }
        System.out.println(found ? key+" Found" : "Not Found");
    }
}
