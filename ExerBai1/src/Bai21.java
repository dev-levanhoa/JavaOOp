import java.util.Scanner;
import java.util.Stack;

public class Bai21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập số nguyên dương từ người dùng
        System.out.print("Nhập một số nguyên dương: ");
        int number = input.nextInt();

        // Kiểm tra số nguyên dương
        if (number <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
            input.close();
            return;
        }

        // Phân tích thành các thừa số nguyên tố
        Stack<Integer> factors = new Stack<>();
        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                factors.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        // Hiển thị các thừa số nguyên tố theo thứ tự giảm dần
        System.out.print("Các thừa số nguyên tố nhỏ nhất: ");
        while (!factors.isEmpty()) {
            System.out.print(factors.pop() + " ");
        }

        input.close();
    }
}