class Number {
    int value;
    Number(int value) { this.value = value; }
}

public class SwapByReference {
    public static void swap(Number n1, Number n2) {
        int temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }

    public static void main(String[] args) {
        Number a = new Number(5);
        Number b = new Number(10);

        System.out.println("Before swap: a = " + a.value + ", b = " + b.value);
        swap(a, b);
        System.out.println("After swap: a = " + a.value + ", b = " + b.value);
    }
}