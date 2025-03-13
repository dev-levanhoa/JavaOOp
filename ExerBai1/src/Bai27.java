public class Bai27 {

    /**
     * Chuyển một chuỗi nhị phân sang số nguyên thập phân.
     *
     * @param binaryString Chuỗi nhị phân cần chuyển đổi.
     * @return Số nguyên thập phân tương ứng.
     */
    public static int parseBinary(String binaryString) {
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            } else if (digit != '0') {
                throw new IllegalArgumentException("Chuỗi nhị phân không hợp lệ: " + binaryString);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        // Test với các chuỗi nhị phân khác nhau
        System.out.println("parseBinary(\"10001\") = " + parseBinary("10001"));
        System.out.println("parseBinary(\"1111\") = " + parseBinary("1111"));
        System.out.println("parseBinary(\"101010\") = " + parseBinary("101010"));
        System.out.println("parseBinary(\"0\") = " + parseBinary("0"));
        System.out.println("parseBinary(\"1\") = " + parseBinary("1"));
        try {
            System.out.println("parseBinary(\"10201\") = " + parseBinary("10201"));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}