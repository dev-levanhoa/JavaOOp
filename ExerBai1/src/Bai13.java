class Stock {
    // Thuộc tính của cổ phiếu
    private String symbol; // Ký hiệu cổ phiếu
    private String name;   // Tên cổ phiếu
    private double previousClosingPrice; // Giá đóng cửa trước đó
    private double currentPrice; // Giá hiện tại

    // Constructor mặc định
    public Stock() {
        this.symbol = "";
        this.name = "";
        this.previousClosingPrice = 0.0;
        this.currentPrice = 0.0;
    }

    // Constructor với ký hiệu và tên cổ phiếu
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Getter cho symbol
    public String getSymbol() {
        return symbol;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    // Setter cho previousClosingPrice
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Getter cho currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    // Setter cho currentPrice
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Phương thức tính phần trăm thay đổi giá cổ phiếu
    public double changePercent() {
        if (previousClosingPrice == 0) {
            return 0; // Tránh chia cho 0
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
public class Bai13 {
    public static void main(String[] args) {
        // Tạo đối tượng Stock với ký hiệu "SUNW" và tên "Sun Microsystems Inc"
        Stock stock = new Stock("SUNW", "Sun Microsystems Inc");

        // Đặt giá trị đóng cửa trước đó là 100
        stock.setPreviousClosingPrice(100);

        // Đặt giá trị cổ phiếu hiện tại là 90
        stock.setCurrentPrice(90);

        // Hiển thị thông tin và tỷ lệ thay đổi giá cổ phiếu
        System.out.println("Stock: " + stock.getSymbol() + " - " + stock.getName());
        System.out.println("Previous Closing Price: $" + stock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + stock.getCurrentPrice());
        System.out.printf("Price Change Percentage: %.2f%%\n", stock.changePercent());
    }
}
