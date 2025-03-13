public class Bai19 {

    public static int sumDigits(int n) {
        if (n < 0) {
            n = -n; // Xử lý số âm
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            n /= 10; // Loại bỏ chữ số cuối cùng
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test với các số khác nhau
        System.out.println("sumDigits(234) = " + sumDigits(234));
        System.out.println("sumDigits(12345) = " + sumDigits(12345));
        System.out.println("sumDigits(1) = " + sumDigits(1));
        System.out.println("sumDigits(0) = " + sumDigits(0));
        System.out.println("sumDigits(-123) = " + sumDigits(-123)); // Test với số âm
    }
}