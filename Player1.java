import java.util.Random;

public class Player1 {
    private int MinRange;
    private int MaxRange;

    public Player1() {
        MinRange = 0;
        MaxRange = 100;
    }

    public int makeGuess() {
        Random random = new Random();
        return random.nextInt(MaxRange - MinRange + 1) + MinRange;
    }
}
