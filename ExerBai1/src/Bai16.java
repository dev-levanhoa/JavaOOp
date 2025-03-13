import java.util.Date;
import java.util.Scanner;

class Loan {
    private double loanAmount;
    private int numberOfYears;
    private double annualInterestRate;
    private Date loanDate;

    Loan() {
        this(1000, 2.5, 1);
    }

    public Loan(double loanAmount, double annualInterestRate, int numberOfYears) {
        if (loanAmount <= 0 || annualInterestRate <= 0 || numberOfYears <= 0) {
            throw new IllegalArgumentException("Invalid loan parameters.");
        }
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanDate = new Date();
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;
        return (monthlyInterestRate * loanAmount) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }

    public double totalPayment() {
        return monthlyPayment() * numberOfYears * 12;
    }
}

public class Bai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Nhập số tiền cho vay: ");
            double loanAmount = input.nextDouble();

            System.out.print("Nhập tỉ lệ lãi suất hàng năm (%): ");
            double annualInterestRate = input.nextDouble();

            System.out.print("Nhập số năm cho vay: ");
            int numberOfYears = input.nextInt();

            Loan loan = new Loan(loanAmount, annualInterestRate, numberOfYears);

            Date loanDate = loan.getLoanDate();
            double monthlyPayment = loan.monthlyPayment();
            double totalPayment = loan.totalPayment();

            System.out.println("\nThông tin khoản vay:");
            System.out.println("Ngày bắt đầu vay: " + loanDate);
            System.out.printf("Số tiền phải trả hàng tháng: %.2f USD\n", monthlyPayment);
            System.out.printf("Tổng số tiền phải trả: %.2f USD\n", totalPayment);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Lỗi: Đầu vào không hợp lệ.");
        } finally {
            input.close();
        }
    }
}