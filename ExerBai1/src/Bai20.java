public class Bai20 {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test với các chuỗi và ký tự khác nhau
        System.out.println("count(\"Welcome\", 'e') = " + count("Welcome", 'e'));
        System.out.println("count(\"Java Programming\", 'a') = " + count("Java Programming", 'a'));
        System.out.println("count(\"Hello World\", 'l') = " + count("Hello World", 'l'));
        System.out.println("count(\"Testing\", 'z') = " + count("Testing", 'z'));
        System.out.println("count(\"\", 'a') = " + count("", 'a')); // Test với chuỗi rỗng
    }
}