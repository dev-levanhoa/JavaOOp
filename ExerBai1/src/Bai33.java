import java.util.Scanner;

public class Bai33 {

    public static boolean isPalindrome(String str) {
        // Loại bỏ khoảng trắng và chuyển về chữ thường
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = cleanStr.length();

        // So sánh ký tự đầu và cuối
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Chuỗi \"" + str + "\" là một palindrom.");
        } else {
            System.out.println("Chuỗi \"" + str + "\" không phải là một palindrom.");
        }

        input.close();
    }
}