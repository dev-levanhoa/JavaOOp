import java.util.Arrays;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Nhập giá trị cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Cách 1: Đảo ngược bằng cách tạo mảng mới
        int[] reversedCopy = reverseWithNewArray(array);
        System.out.println("Mảng đảo ngược (tạo mảng mới): " + Arrays.toString(reversedCopy));

        // Cách 2: Đảo ngược trực tiếp trong mảng gốc
        reverseInPlace(array);
        System.out.println("Mảng đảo ngược (không tạo mảng mới): " + Arrays.toString(array));

        scanner.close();
    }

    // Cách 1: Đảo ngược bằng cách tạo mảng mới
    public static int[] reverseWithNewArray(int[] arr) {
        int n = arr.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = arr[n - 1 - i]; // Copy từ cuối về đầu
        }

        return newArray;
    }

    // Cách 2: Đảo ngược trực tiếp trong mảng gốc (không tạo mảng mới)
    public static void reverseInPlace(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Hoán đổi hai phần tử
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
