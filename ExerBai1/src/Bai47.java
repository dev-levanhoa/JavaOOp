public class Bai47 {

    /**
     * Thay thế tất cả xâu y trong xâu x bằng xâu z.
     *
     * @param x Xâu gốc.
     * @param y Xâu cần thay thế.
     * @param z Xâu thay thế.
     * @return Xâu mới sau khi thay thế.
     */
    public static String replace(String x, String y, String z) {
        return x.replace(y, z);
    }

    public static void main(String[] args) {
        String x = "Hello world, hello Java!";
        String y = "hello";
        String z = "hi";
        String result = replace(x, y, z);
        System.out.println("Xâu gốc: " + x);
        System.out.println("Xâu sau khi thay thế: " + result);
    }
}