abstract class Animal1 {
    String name;
    double weight;

    // Phương thức trừu tượng
    public abstract void grow();
}

// Lớp Chicken kế thừa Animal và triển khai grow()
class Chicken extends Animal1 {
    @Override
    public void grow() {
        System.out.println("The chicken is growing!");
    }
}

// Chạy chương trình
public class InterfacePPtTest {
    public static void main(String[] args) {
        Chicken myChicken = new Chicken();
        myChicken.grow(); // Output: The chicken is growing!
    }
}
