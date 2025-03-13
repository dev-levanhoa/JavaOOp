public class Bai15 {
    public static void main(String[] args) {
        // Test các giá trị
        int[] testValues = {8, 298, 9123};
        for (int value : testValues) {
            String binary = convertDecimalToBinary(value);
            System.out.println("Giá trị thập phân " + value + " chuyển sang nhị phân là: " + binary);
        }
    }

    // Phương thức chuyển đổi số nguyên hệ thập phân sang hệ nhị phân
    public static String convertDecimalToBinary(int value) {
        if (value == 0) {
            return "0"; // Trường hợp đặc biệt khi giá trị là 0
        }

        StringBuilder binary = new StringBuilder();
        while (value > 0) {
            int remainder = value % 2; // Lấy phần dư khi chia cho 2
            binary.insert(0, remainder); // Chèn phần dư vào đầu chuỗi
            value = value / 2; // Chia giá trị cho 2
        }
        return binary.toString();
    }
}