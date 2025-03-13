public class Bai26 {

    /**
     * Tính Ước số chung lớn nhất (USCLN) của hai số nguyên dương m và n.
     *
     * @param m Số nguyên dương thứ nhất.
     * @param n Số nguyên dương thứ hai.
     * @return USCLN của m và n.
     */
    public static int uscln(int m, int n) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return m;
    }

    /**
     * Tính Bội số chung nhỏ nhất (BCNN) của hai số nguyên dương m và n.
     *
     * @param m Số nguyên dương thứ nhất.
     * @param n Số nguyên dương thứ hai.
     * @return BCNN của m và n.
     */
    public static int bcnn(int m, int n) {
        return (m * n) / uscln(m, n);
    }

    public static void main(String[] args) {
        // Test với các cặp số khác nhau
        int m1 = 12, n1 = 18;
        System.out.println("USCLN(" + m1 + ", " + n1 + ") = " + uscln(m1, n1));
        System.out.println("BCNN(" + m1 + ", " + n1 + ") = " + bcnn(m1, n1));

        int m2 = 24, n2 = 36;
        System.out.println("USCLN(" + m2 + ", " + n2 + ") = " + uscln(m2, n2));
        System.out.println("BCNN(" + m2 + ", " + n2 + ") = " + bcnn(m2, n2));

        int m3 = 17, n3 = 23;
        System.out.println("USCLN(" + m3 + ", " + n3 + ") = " + uscln(m3, n3));
        System.out.println("BCNN(" + m3 + ", " + n3 + ") = " + bcnn(m3, n3));
    }
}