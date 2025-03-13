import java.io.*;
import java.util.Random;

public class Bai30 {

    public static void main(String[] args) {
        String fileName = "Cau30.dat";
        Random random = new Random();

        // Ghi dữ liệu vào file nhị phân
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, true))) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(100);
                dos.writeInt(randomNumber);
            }
            System.out.println("Đã ghi 100 số nguyên ngẫu nhiên vào file.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file nhị phân và tính tổng
        int sum = 0;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int number = dis.readInt();
                sum += number;
            }
            System.out.println("Tổng các số nguyên trong file: " + sum);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}