import java.util.Scanner;

public class Bai44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = input.nextLine();

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    System.out.println(word.toString());
                    word.setLength(0); // Xóa từ đã in
                }
            }
        }

        // In từ cuối cùng (nếu có)
        if (word.length() > 0) {
            System.out.println(word.toString());
        }

        input.close();
    }
}