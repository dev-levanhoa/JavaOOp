package datavalidation_dambaodulieuhople;
import java.util.Scanner;
public class User {
    private String username;
    private String password;
    public User(String username, String password){
        this.username = username;
        setPassword(password);
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String newPassword){
        if(newPassword.length() >= 8){
            this.password = newPassword;
        }else{
            System.out.println("Mat khau phai co it nhat 8 chu so!");
        }
    }
    public boolean checkPassword(String inputPassword){
        return password.equals(inputPassword);
    }
}
