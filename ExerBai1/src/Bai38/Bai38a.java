package Bai38;
public class Bai38a {

    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Tham số không hợp lệ: " + arg);
            }
        }
        System.out.println("Tong cac so la " + sum);
    }
}