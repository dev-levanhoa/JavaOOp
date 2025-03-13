public class Bai29 {

    /**
     * Tính giá trị trung bình của một mảng số nguyên.
     *
     * @param array Mảng số nguyên.
     * @return Giá trị trung bình của mảng.
     */
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Tính giá trị trung bình của một mảng số thực.
     *
     * @param array Mảng số thực.
     * @return Giá trị trung bình của mảng.
     */
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test với mảng số nguyên
        int[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Giá trị trung bình của intArray: " + average(intArray));

        // Test với mảng số thực
        double[] doubleArray = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        System.out.println("Giá trị trung bình của doubleArray: " + average(doubleArray));
    }
}