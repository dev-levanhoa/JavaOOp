package protectinformatinclient;
import java.util.Scanner;

public class ProtectInformatinClient {

    public static void main(String[] args) {
        BlankAccount tk1 = new BlankAccount();
        tk1.NapTK(1000);
        System.out.println("Số dư tài khoản : " + tk1.GetBalance());
        tk1.ChuyenTK(1111);
        tk1.ChuyenTK(500);
        System.out.println("Số dư tài khoản : " + tk1.GetBalance());
    }
}
