import java.util.Arrays;
import java.util.Arrays;
import java.util.Random;

class LinearSearch {

    /**
     * Tìm kiếm tuần tự một phần tử trong một dãy số nguyên.
     *
     * @param list Dãy số nguyên cần tìm kiếm.
     * @param key  Phần tử cần tìm.
     * @return Vị trí tìm thấy phần tử, -1 nếu không tìm thấy.
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

class BinarySearch {

    /**
     * Tìm kiếm nhị phân một phần tử trong một dãy số nguyên đã được sắp xếp.
     *
     * @param list Dãy số nguyên đã được sắp xếp.
     * @param key  Phần tử cần tìm.
     * @return Vị trí tìm thấy phần tử, giá trị âm nếu không tìm thấy.
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -(low + 1); // Trả về vị trí âm nếu không tìm thấy
    }
}
public class Bai40 {

    public static void main(String[] args) {
        int[] list = new int[100000];
        Random random = new Random();

        // Khởi tạo dãy số nguyên ngẫu nhiên
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(1000000);
        }

        // Tạo phần tử cần tìm kiếm ngẫu nhiên
        int key = random.nextInt(1000000);

        // Tìm kiếm tuần tự
        long startTime = System.currentTimeMillis();
        int linearResult = LinearSearch.linearSearch(list, key);
        long endTime = System.currentTimeMillis();
        System.out.println("Tìm kiếm tuần tự: ");
        System.out.println("  Phần tử tìm thấy tại vị trí: " + linearResult);
        System.out.println("  Thời gian: " + (endTime - startTime) + " ms");

        // Sắp xếp dãy số để sử dụng tìm kiếm nhị phân
        Arrays.sort(list);

        // Tìm kiếm nhị phân
        startTime = System.currentTimeMillis();
        int binaryResult = BinarySearch.binarySearch(list, key);
        endTime = System.currentTimeMillis();
        System.out.println("Tìm kiếm nhị phân: ");
        System.out.println("  Phần tử tìm thấy tại vị trí: " + (binaryResult >= 0 ? binaryResult : "không tìm thấy"));
        System.out.println("  Thời gian: " + (endTime - startTime) + " ms");
    }
}