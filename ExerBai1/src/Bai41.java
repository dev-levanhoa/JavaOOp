import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai41 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Sử dụng: java Cau41 <tên_file>");
            System.exit(1);
        }

        String fileName = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        boolean inWord = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                if (ch != '\r' && ch != '\n') {
                    charCount++;
                }

                if (Character.isWhitespace(ch)) {
                    if (inWord) {
                        wordCount++;
                        inWord = false;
                    }
                    if (ch == '\n') {
                        lineCount++;
                    }
                } else {
                    inWord = true;
                }
            }

            // Xử lý từ cuối cùng trong file
            if (inWord) {
                wordCount++;
            }

            // Xử lý dòng cuối cùng (nếu không kết thúc bằng '\n')
            if (charCount > 0 && reader.readLine() == null) {
                lineCount++;
            }

        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("File " + fileName + " co");
        System.out.println(charCount + " ky tu");
        System.out.println(wordCount + " tu");
        System.out.println(lineCount + " dong");
    }
}