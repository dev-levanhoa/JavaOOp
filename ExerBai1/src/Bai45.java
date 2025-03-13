public class Bai45 {

    /**
     * Tính tổng chuỗi đệ quy.
     *
     * @param i Chỉ số của chuỗi.
     * @return Tổng của chuỗi.
     */
    public static double m(int i) {
        if (i == 1) {
            return 1.0;
        }
        return 1.0 / i + m(i - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("m(" + i + ") = " + m(i));
        }
    }
}