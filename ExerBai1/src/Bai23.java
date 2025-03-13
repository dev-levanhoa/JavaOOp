public class Bai23 {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Test với các số khác nhau
        System.out.println("reverse(3456) = " + reverse(3456));
        System.out.println("reverse(12345) = " + reverse(12345));
        System.out.println("reverse(1) = " + reverse(1));
        System.out.println("reverse(0) = " + reverse(0));
        System.out.println("reverse(-123) = " + reverse(-123)); // Test với số âm
    }
}