public class Bai48
{

    /**
     * Hiển thị giá trị của một số nguyên theo thứ tự đảo ngược.
     *
     * @param value Số nguyên cần hiển thị.
     */
    public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.print(value);
        } else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }

    public static void main(String[] args) {
        reverseDisplay(2341); // Hiển thị 1432
        System.out.println(); // Xuống dòng
        reverseDisplay(12345); // Hiển thị 54321
        System.out.println(); // Xuống dòng
    }
}