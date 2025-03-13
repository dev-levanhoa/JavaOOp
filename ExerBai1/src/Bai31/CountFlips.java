package Bai31;
public class CountFlips {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < 1000; i++) {
            coin.flip();
            if (coin.isHeads()) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Số lần mặt ngửa: " + headsCount);
        System.out.println("Số lần mặt sấp: " + tailsCount);
    }
}