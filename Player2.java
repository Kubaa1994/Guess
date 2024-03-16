public class Player2 {
    private int MinRange;
    private int MaxRange;

    public Player2() {
        MinRange = 0;
        MaxRange = 100;
    }

    public int makeGuess() {
        return (MinRange + MaxRange) / 2;
    }
}
