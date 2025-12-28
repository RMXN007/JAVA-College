public class ArrayofPrimitives {
    static int[] createArray() {
        return new int[]{1, 2, 3, 4};
    }
    public static void main(String[] args) {
        int[] arr = createArray();
        for (int x : arr)
            System.out.println(x);
    }
}
