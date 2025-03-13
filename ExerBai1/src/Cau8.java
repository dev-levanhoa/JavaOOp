import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0, countNegative = 0, sum = 0, count = 0;

        System.out.println("Nhập các số nguyên (Nhập 0 để kết thúc):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;

            if (num > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        // Hiển thị kết quả
        System.out.println("Số số nguyên dương: " + countPositive);
        System.out.println("Số số nguyên âm: " + countNegative);
        System.out.println("Tổng các số đã nhập: " + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Giá trị trung bình: %.2f%n", average);
        } else {
            System.out.println("Không có số nào để tính giá trị trung bình.");
        }

        scanner.close();
    }
}
