package Bai38;
public class Bai38b {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Sử dụng: java Cau38b \"số1 số2 ... sốN\"");
            System.exit(1);
        }

        String input = args[0];
        String[] numbers = input.split("\\s+"); // Tách chuỗi thành các số

        int sum = 0;
        for (String numberStr : numbers) {
            try {
                int number = Integer.parseInt(numberStr);
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Số không hợp lệ: " + numberStr);
            }
        }
        System.out.println("Tong cac so la " + sum);
    }
}