public class Cau31{
    Cau31(){
        System.out.print("Superclass");
    }
    public static void main (String args[]){
        new Cau32();
    }
}
class Cau32 extends Cau31{
    Cau32(){
        System.out.print("Subclass");
    }
}
