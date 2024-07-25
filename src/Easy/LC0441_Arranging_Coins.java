package Easy;

public class LC0441_Arranging_Coins {
    public int arrangeCoins(int n) {
        int stairs = 1;
        while (n >= stairs) {
            n = n - stairs;
            stairs++;
        }
        return stairs-1;
    }
}
