class Fan {
    // Hằng số tốc độ
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính của quạt
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor mặc định
    public Fan() {
        this.speed = SLOW;  // Mặc định là SLOW
        this.on = false;     // Mặc định là tắt
        this.radius = 5;     // Mặc định là 5
        this.color = "blue"; // Mặc định là màu xanh
    }

    // Getter và Setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString() mô tả quạt
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is OFF - Color: " + color + ", Radius: " + radius;
        }
    }
}


public class Bai10Fan {
    public static void main(String[] args) {
        // Tạo đối tượng Fan thứ nhất với tốc độ cao nhất, bật, màu vàng, bán kính 10
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Tạo đối tượng Fan thứ hai với tốc độ trung bình, tắt, màu trắng, bán kính 5
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("white");
        fan2.setOn(false);

        // Hiển thị thông tin quạt
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
