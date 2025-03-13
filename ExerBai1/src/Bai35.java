import java.util.Arrays;

public class Bai35 {

    /**
     * Sắp xếp một chuỗi theo thứ tự bảng chữ cái.
     *
     * @param s Chuỗi cần sắp xếp.
     * @return Chuỗi đã được sắp xếp.
     */
    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Kiểm tra xem hai chuỗi có phải là anagram hay không.
     *
     * @param s1 Chuỗi thứ nhất.
     * @param s2 Chuỗi thứ hai.
     * @return true nếu hai chuỗi là anagram, false nếu không.
     */
    public static boolean isAnagram(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    public static void main(String[] args) {
        System.out.println("isAnagram(\"silent\", \"listen\") = " + isAnagram("silent", "listen"));
        System.out.println("isAnagram(\"garden\", \"ranged\") = " + isAnagram("garden", "ranged"));
        System.out.println("isAnagram(\"split\", \"lisp\") = " + isAnagram("split", "lisp"));
    }
}