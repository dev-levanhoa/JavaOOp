package datavalidation_dambaodulieuhople;
import java.util.Scanner;
public class DataValidation_DamBaoDuLieuHopLe {
public static void main(String[] args) {
        User user1 = new User("LeVanHoa", "01112005");
        System.out.println("Ten dang nhap : " + user1.getUsername());
        if(user1.checkPassword("011105")){
            System.out.println("Mat khau dung !");
        }else{
            System.out.println("Mat khau sai !");
        }
    }    
}
