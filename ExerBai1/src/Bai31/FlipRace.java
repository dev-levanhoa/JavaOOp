package Bai31;
public class FlipRace {
    public static void main(String[] args) {
        Coin playerCoin = new Coin();
        Coin computerCoin = new Coin();

        int playerHeadsCount = 0;
        int computerHeadsCount = 0;

        while (playerHeadsCount < 3 && computerHeadsCount < 3) {
            playerCoin.flip();
            computerCoin.flip();

            if (playerCoin.isHeads()) {
                playerHeadsCount++;
            } else {
                playerHeadsCount = 0;
            }

            if (computerCoin.isHeads()) {
                computerHeadsCount++;
            } else {
                computerHeadsCount = 0;
            }

            System.out.println("Người chơi: " + playerCoin + ", Máy tính: " + computerCoin);
        }

        if (playerHeadsCount == 3 && computerHeadsCount == 3) {
            System.out.println("Hòa nhau!");
        } else if (playerHeadsCount == 3) {
            System.out.println("Người chơi thắng!");
        } else {
            System.out.println("Máy tính thắng!");
        }
    }
}