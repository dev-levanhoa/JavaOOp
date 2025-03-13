package Bai34;
public class TestClockS {
    public static void main(String[] args) {
        ClockS clock = new ClockS();

        // Kiểm tra giờ mặc định
        System.out.println("Giờ mặc định: " + clock.getTime());

        // Thiết lập giờ mới
        clock.setTime(10, 30, 45);
        System.out.println("Giờ sau khi thiết lập: " + clock.getTime());

        // Kiểm tra các phương thức get
        System.out.println("Giờ: " + clock.getHours());
        System.out.println("Phút: " + clock.getMinutes());
        System.out.println("Giây: " + clock.getSeconds());

        // Kiểm tra tổng số giây
        System.out.println("Tổng số giây: " + clock.totalSeconds());

        // Thêm giây
        clock.addSeconds(60);
        System.out.println("Giờ sau khi thêm 60 giây: " + clock.getTime());

        // Trừ giây
        clock.addSeconds(-120);
        System.out.println("Giờ sau khi trừ 120 giây: " + clock.getTime());
    }
}