package Bai31;
import java.util.Random;

public class Coin {
    public static final int HEADS = 0;
    public static final int TAILS = 1;

    private int face;

    public Coin() {
        flip();
    }

    public void flip() {
        Random random = new Random();
        face = random.nextInt(2);
    }

    public boolean isHeads() {
        return face == HEADS;
    }

    @Override
    public String toString() {
        return face == HEADS ? "Heads" : "Tails";
    }
}