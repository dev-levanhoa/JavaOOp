class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        if (empty()) {
            return -1; // Hoặc ném ngoại lệ
        }
        return elements[size - 1];
    }

    public void push(int value) {
        if (size == elements.length) {
            // Tăng kích thước mảng nếu cần thiết
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        if (empty()) {
            return -1; // Hoặc ném ngoại lệ
        }
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}

public class Bai28 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        // Thêm các số từ 0 đến 10 vào stack
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
        }

        // Lấy và in các phần tử từ stack
        System.out.println("Các phần tử trong stack (theo thứ tự LIFO):");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Sử dụng StackOfIntegers để tìm thừa số nguyên tố
        int number = 120; // Số cần phân tích
        StackOfIntegers factors = new StackOfIntegers();

        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                factors.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        // In các thừa số nguyên tố theo thứ tự giảm dần
        System.out.print("Các thừa số nguyên tố nhỏ nhất: ");
        while (!factors.empty()) {
            System.out.print(factors.pop() + " ");
        }
        System.out.println();
    }
}