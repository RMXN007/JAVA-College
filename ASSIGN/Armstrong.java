public class Armstrong {
    public static void main(String[] args) {
        int num = 153, rem, sum = 0, temp = num;
        while(temp > 0) {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
    }
}
