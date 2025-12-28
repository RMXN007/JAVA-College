public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat(" world"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("he"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.indexOf('l'));
        System.out.println(str.equals("hello"));
        System.out.println(str.replace('h', 'y'));
        System.out.println(str.substring(1,4));
        System.out.println(str.compareTo("hello"));
        // and others as needed
    }
}
