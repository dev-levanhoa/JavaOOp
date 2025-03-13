import java.util.Scanner;

public class Bai36 {

    /**
     * Tính số Fibonacci thứ index sử dụng đệ quy.
     *
     * @param index Chỉ số của số Fibonacci cần tính.
     * @return Số Fibonacci thứ index.
     */
    public static long fib1(long index) {
        if (index <= 1) {
            return index;
        }
        return fib1(index - 1) + fib1(index - 2);
    }

    /**
     * Tính số Fibonacci thứ index sử dụng vòng lặp.
     *
     * @param index Chỉ số của số Fibonacci cần tính.
     * @return Số Fibonacci thứ index.
     */
    public static long fib2(long index) {
        if (index <= 1) {
            return index;
        }
        long a = 0, b = 1, fib = 0;
        for (int i = 2; i <= index; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chỉ số Fibonacci: ");
        long index = input.nextLong();

        System.out.println("Fibonacci(" + index + ") (đệ quy) = " + fib1(index));
        System.out.println("Fibonacci(" + index + ") (vòng lặp) = " + fib2(index));

        input.close();
    }
}