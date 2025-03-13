import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bai43 {

    public static void main(String[] args) {
        String fileName = "Cau43.txt";
        Random random = new Random();

        // Ghi 100 số nguyên ngẫu nhiên vào file
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1000); // Tạo số ngẫu nhiên trong khoảng 0-999
                writer.print(randomNumber + " ");
            }
            System.out.println("Đã ghi 100 số nguyên ngẫu nhiên vào file.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file và hiển thị theo thứ tự tăng dần
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            Collections.sort(numbers); // Sắp xếp theo thứ tự tăng dần
            System.out.println("Các số nguyên trong file theo thứ tự tăng dần:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file: " + e.getMessage());
        }
    }
}