import java.util.Random;

class RandomCharacter {

    /** Trả về một ký tự ngẫu nhiên trong khoảng ch1 và ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Trả về một ký tự thường ngẫu nhiên */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Trả về một ký tự hoa ngẫu nhiên */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Trả về một ký tự số ngẫu nhiên */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** Trả về một ký tự ngẫu nhiên */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
public class Bai24 {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        // Tạo và in 175 ký tự thường ngẫu nhiên, 25 ký tự mỗi dòng
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char randomChar = RandomCharacter.getRandomLowerCaseLetter();
            System.out.print(randomChar);
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}