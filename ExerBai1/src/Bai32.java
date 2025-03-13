public class Bai32 {

    /**
     * Chuyển đổi milliseconds sang định dạng hours:minutes:seconds.
     *
     * @param timeMillis Số milliseconds cần chuyển đổi.
     * @return Chuỗi định dạng hours:minutes:seconds.
     */
    public static String convertMillis(long timeMillis) {
        long seconds = timeMillis / 1000;
        long hours = seconds / 3600;
        seconds %= 3600;
        long minutes = seconds / 60;
        seconds %= 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Test với các giá trị milliseconds khác nhau
        System.out.println("convertMillis(5500) = " + convertMillis(5500));
        System.out.println("convertMillis(100000) = " + convertMillis(100000));
        System.out.println("convertMillis(555550000) = " + convertMillis(555550000));
    }
}