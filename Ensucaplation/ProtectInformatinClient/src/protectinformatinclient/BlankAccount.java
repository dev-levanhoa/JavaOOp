/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protectinformatinclient;

/**
 *
 * @author XPS
 */
public class BlankAccount {
    private double balance;
    public double GetBalance(){
        return balance;
    }
    //Nạp tiền tài khoản
    public void NapTK(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Gửi tiền thành công. Số dư mới : "+ balance);
        }
        else
            System.out.println("Số tiền gửi không hợp lệ!");
    }
    //Chuyển tiền
    public void ChuyenTK(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Chuyển tiền thành công. Số dư mới: " + balance);
        }else
            System.out.println("Số tiền chuyển không hợp lệ hoặc vượt quá mức số dư !");
    }
}
