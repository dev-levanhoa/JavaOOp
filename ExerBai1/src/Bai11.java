public class Bai11 {
    public static void main(String[] args) {
        final int NUM_PRIMES = 1000; // Số lượng số nguyên tố cần tìm
        final int NUM_PER_LINE = 10; // Số số nguyên tố trên mỗi dòng
        int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy
        int number = 2; // Bắt đầu từ số 2 (số nguyên tố đầu tiên)

        while (count < NUM_PRIMES) {
            if (isPrime(number)) {
                System.out.printf("%-5d", number); // In số nguyên tố với khoảng cách cố định
                count++;
                if (count % NUM_PER_LINE == 0) {
                    System.out.println(); // Xuống dòng sau mỗi 10 số
                }
            }
            number++;
        }
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Nếu chia hết cho một số khác 1 và chính nó thì không phải số nguyên tố
            }
        }
        return true;
    }
}
