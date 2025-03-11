import java.util.Scanner;
import java.util.Vector;

// Lớp Entry đại diện cho một mục trong danh bạ
class Entry {
    String name;
    String phoneNumber;

    public Entry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Họ tên: " + name + ", Số điện thoại: " + phoneNumber;
    }
}

// Lớp PhoneBook quản lý danh bạ điện thoại
class PhoneBook {
    private Vector<Entry> contacts;

    public PhoneBook() {
        contacts = new Vector<>();
    }

    // Thêm entry vào danh bạ
    public void addEntry(String name, String phoneNumber) {
        contacts.add(new Entry(name, phoneNumber));
        System.out.println("Đã thêm thành công!");
    }

    // Tìm số điện thoại theo tên
    public String getPhoneNumber(String name) {
        for (Entry entry : contacts) {
            if (entry.name.equalsIgnoreCase(name)) {
                return entry.phoneNumber;
            }
        }
        return "Không tìm thấy tên trong danh bạ.";
    }

    // Thay đổi số điện thoại
    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        for (Entry entry : contacts) {
            if (entry.name.equalsIgnoreCase(name)) {
                entry.phoneNumber = newPhoneNumber;
                return true;
            }
        }
        return false;
    }

    // Xóa một entry khỏi danh bạ
    public boolean deleteEntry(String name) {
        return contacts.removeIf(entry -> entry.name.equalsIgnoreCase(name));
    }

    // Hiển thị toàn bộ danh bạ
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            for (Entry entry : contacts) {
                System.out.println(entry);
            }
        }
    }
}

// Lớp chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;

        do {
            System.out.println("\n===== MENU DANH BẠ =====");
            System.out.println("1. Thêm số điện thoại");
            System.out.println("2. Tìm số điện thoại");
            System.out.println("3. Sửa đổi số điện thoại");
            System.out.println("4. Xóa số điện thoại");
            System.out.println("5. Hiển thị danh bạ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addEntry(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Nhập họ tên cần tìm: ");
                    name = scanner.nextLine();
                    System.out.println("Số điện thoại: " + phoneBook.getPhoneNumber(name));
                    break;
                case 3:
                    System.out.print("Nhập họ tên cần sửa số: ");
                    name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    phoneNumber = scanner.nextLine();
                    if (phoneBook.updatePhoneNumber(name, phoneNumber)) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy tên trong danh bạ.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập họ tên cần xóa: ");
                    name = scanner.nextLine();
                    if (phoneBook.deleteEntry(name)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy tên trong danh bạ.");
                    }
                    break;
                case 5:
                    phoneBook.listContacts();
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
