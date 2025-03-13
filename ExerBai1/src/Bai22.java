public class Bai22 {

    // Lớp MyDate
    public static class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return day + "/" + month + "/" + year;
        }
    }

    // Lớp Person
    public static class Person {
        private String name;
        private String address;
        private String phoneNumber;
        private String emailAddress;

        public Person(String name, String address, String phoneNumber, String emailAddress) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        @Override
        public String toString() {
            return "Person";
        }
    }

    // Lớp Student
    public static class Student extends Person {
        public static final String FRESHMAN = "freshman";
        public static final String SOPHOMORE = "sophomore";
        public static final String JUNIOR = "junior";
        public static final String SENIOR = "senior";

        private String classStatus;

        public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
            super(name, address, phoneNumber, emailAddress);
            this.classStatus = classStatus;
        }

        @Override
        public String toString() {
            return "Student";
        }
    }

    // Lớp Employee
    public static class Employee extends Person {
        private String office;
        private double salary;
        private MyDate dateHired;

        public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
            super(name, address, phoneNumber, emailAddress);
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }

        @Override
        public String toString() {
            return "Employee";
        }
    }

    // Lớp Faculty
    public static class Faculty extends Employee {
        private String officeHours;
        private String rank;

        public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
            super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Faculty";
        }
    }

    // Lớp Staff
    public static class Staff extends Employee {
        private String title;

        public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
            super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
            this.title = title;
        }

        @Override
        public String toString() {
            return "Staff";
        }
    }

    // Chương trình kiểm thử TestClasses
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john.doe@example.com");
        Student student = new Student("Jane Smith", "456 Elm St", "987-654-3210", "jane.smith@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Alice Johnson", "789 Oak St", "111-222-3333", "alice.johnson@example.com", "Office 101", 50000, new MyDate(2023, 1, 1));
        Faculty faculty = new Faculty("Bob Williams", "101 Pine St", "444-555-6666", "bob.williams@example.com", "Office 202", 70000, new MyDate(2022, 8, 15), "Monday 10-12", "Professor");
        Staff staff = new Staff("Carol Brown", "202 Maple St", "777-888-9999", "carol.brown@example.com", "Office 303", 40000, new MyDate(2023, 3, 1), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}