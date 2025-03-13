import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b){
            a = a+b;
            b = a-b;
            a = a-b;
        }
        if(a > c){
            a = a+c;
            c = a-c;
            a = a-c;
        }

        if(b > c){
            b = b+c;
            c = b-c;
            b = b-c;
        }
        System.out.print(a + " " + b + " " + c);
    }
}