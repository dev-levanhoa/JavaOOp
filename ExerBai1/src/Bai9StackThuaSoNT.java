import java.util.Scanner;
import java.util.Stack;
public class Bai9StackThuaSoNT {
    // Hàm tìm thừa số nguyên tố bằng Stack (Không dùng đệ quy)
    public static void findPrimeFactors(int n) {
        Stack<Integer> stack = new Stack<>();

        // Chia hết cho 2 trước
        while (n % 2 == 0) {
            stack.push(2);
            n /= 2;
        }

        // Xét các số lẻ từ 3 trở đi
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                stack.push(i);
                n /= i;
            }
        }

        // Nếu n còn lại là số nguyên tố > 2
        if (n > 2) {
            stack.push(n);
        }

        // In ra theo thứ tự đúng
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    // Hàm đệ quy tìm thừa số nguyên tố và in trực tiếp
    public static void findPrimeFactors(int n, int divisor) {
        if (n <= 1) {
            return; // Điều kiện dừng
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            findPrimeFactors(n / divisor, divisor); // Đệ quy tiếp tục chia
        } else {
            findPrimeFactors(n, divisor + 1); // Tăng divisor lên nếu không chia hết
        }
    }
    //Cách thông thường
    public static void primeFactors(int n) {
        // In ra số 2 cho đến khi n không chia hết cho 2 nữa
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Xét các số lẻ từ 3 trở đi
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // Nếu n vẫn còn lớn hơn 2 thì nó là số nguyên tố
        if (n > 2) {
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        // Xử lý trường hợp số âm hoặc 0
        if (num <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            System.out.print("Các thừa số nguyên tố: ");
            primeFactors(num);
        }

        scanner.close();
    }
}