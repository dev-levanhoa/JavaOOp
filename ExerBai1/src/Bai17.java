import java.util.Arrays;
import java.util.Scanner;

public class Bai17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập số lượng sinh viên và số lượng câu hỏi
        System.out.print("Nhập số lượng sinh viên: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Nhập số lượng câu hỏi: ");
        int numberOfQuestions = input.nextInt();

        // Nhập đáp án đúng
        char[] correctAnswers = new char[numberOfQuestions];
        System.out.println("Nhập đáp án đúng:");
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.print("Câu " + (i + 1) + ": ");
            correctAnswers[i] = input.next().charAt(0);
        }

        // Nhập câu trả lời của sinh viên
        char[][] studentAnswers = new char[numberOfStudents][numberOfQuestions];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Nhập câu trả lời của sinh viên " + (i + 1) + ":");
            for (int j = 0; j < numberOfQuestions; j++) {
                System.out.print("Câu " + (j + 1) + ": ");
                studentAnswers[i][j] = input.next().charAt(0);
            }
        }

        // Mảng lưu trữ số câu trả lời đúng của từng sinh viên
        int[] correctCounts = new int[numberOfStudents];

        // Tính số câu trả lời đúng cho từng sinh viên
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfQuestions; j++) {
                if (studentAnswers[i][j] == correctAnswers[j]) {
                    correctCounts[i]++;
                }
            }
        }

        // Tạo mảng 2 chiều để lưu trữ sinh viên và số câu trả lời đúng
        int[][] studentScores = new int[numberOfStudents][2];
        for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i][0] = i + 1; // Lưu trữ số thứ tự sinh viên (bắt đầu từ 1)
            studentScores[i][1] = correctCounts[i]; // Lưu trữ số câu trả lời đúng
        }

        // Sắp xếp mảng sinh viên theo số câu trả lời đúng tăng dần
        Arrays.sort(studentScores, (a, b) -> a[1] - b[1]);

        // Hiển thị kết quả
        System.out.println("\nKết quả chấm điểm:");
        for (int[] studentScore : studentScores) {
            System.out.println("Sinh viên " + studentScore[0] + ": " + studentScore[1] + " câu trả lời đúng");
        }

        input.close();
    }
}