import java.util.Scanner;

abstract class Employee{
    String name;
    public abstract double earnings();
}

class Boss extends Employee{
    public double SalaB;
    Boss(String name, double SalaB){
        this.name = name;
        this.SalaB = SalaB;
    }
    public double earnings(){
        return SalaB;
    }
    @Override
    public String toString(){
        return "Tên : " + this.name + " || Lương : " + earnings();
    }
}

class PieceWorker extends Employee{
    public int countW;
    PieceWorker(String name, int c){
        this.name = name;
        this.countW = c;
    }
    public double earnings(){
        double TongL = countW*0.5;
        return TongL;
    }
    @Override
    public String toString(){
        return "Tên : " + this.name + " || Lương : " + earnings();
    }
}

class CommissionWorker extends Employee{
    public int CountC;
    public double SalaC;
    CommissionWorker(String name, int CountC, double SalaC){
        this.name = name;
        this.CountC = CountC;
        this.SalaC = SalaC;
    }
    public double earnings(){
        double TongC = SalaC + CountC*0.1;
        return TongC;
    }
    @Override
    public String toString(){
        return "Tên : " + this.name + " || Lương : " + earnings();
    }
}

public class AsbtractEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boss obj1 = new Boss("Lê Văn Hòa", 100.00);
        PieceWorker obj2 = new PieceWorker("Lê Văn Dũng", 15);
        CommissionWorker obj3 = new CommissionWorker("Lê Văn Đại", 20, 80.00);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}