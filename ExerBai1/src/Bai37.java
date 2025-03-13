import java.io.*;
import java.util.Scanner;

public class Bai37 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Sử dụng: java Cau37 <tên_file> <xâu_cần_xóa>");
            System.exit(1);
        }

        String fileName = args[0];
        String stringToRemove = args[1];
        String tempFileName = "temp.txt"; // Tên file tạm thời

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Loại bỏ xâu khỏi dòng
                String modifiedLine = line.replaceAll(stringToRemove, "");
                writer.println(modifiedLine);
            }

        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
            System.exit(1);
        }

        // Thay thế file gốc bằng file tạm thời
        try {
            File originalFile = new File(fileName);
            File tempFile = new File(tempFileName);

            if (originalFile.delete()) {
                if (!tempFile.renameTo(originalFile)) {
                    System.err.println("Không thể thay thế file gốc.");
                    System.exit(1);
                }
            } else {
                System.err.println("Không thể xóa file gốc.");
                System.exit(1);
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi thay thế file: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Đã loại bỏ xâu \"" + stringToRemove + "\" khỏi file \"" + fileName + "\".");
    }
}