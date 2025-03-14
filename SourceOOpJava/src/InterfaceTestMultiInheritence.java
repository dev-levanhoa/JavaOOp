interface Animal{
    void eat();
}

interface CanFly{
    void fly();
}

class Bird implements Animal, CanFly{
    public void eat() {
        System.out.println("Bird is eating !");
    }

    public void fly() {
        System.out.println("Bird is flying !");
    }
}

public class InterfaceTestMultiInheritence {
    public static void main(String[] args) {
        Bird B1 = new Bird();
        B1.eat();
        B1.fly();
    }
}