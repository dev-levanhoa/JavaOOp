public class Bai39 {

    /**
     * Chuyển đổi số hệ 16 sang hệ 10.
     *
     * @param s Chuỗi biểu diễn số hệ 16.
     * @return Số hệ 10 tương ứng.
     */
    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    /**
     * Chuyển đổi số hệ 10 sang hệ 16.
     *
     * @param d Số hệ 10 cần chuyển đổi.
     * @return Chuỗi biểu diễn số hệ 16 tương ứng.
     */
    public static String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;
            hex = digits.charAt(digit) + hex;
            d = d / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        String hex = "1A2B";
        int decimal = 4096;

        System.out.println("Hex " + hex + " to Decimal: " + hex2decimal(hex));
        System.out.println("Decimal " + decimal + " to Hex: " + decimal2hex(decimal));
    }
}