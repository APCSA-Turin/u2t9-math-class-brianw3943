public class CoinFlip {
    private CoinFlip() {}
    
    public String flip() {
        int num = (int) (Math.random() * 2);
        if (num == 0) {
            return "tails";
        } else {
            return "heads";}
        }

    public double Simulate(int numFlips) {
        int numTails = 0;
        int numHeads = 0;
        for (int i = 0; i < numFlips;  i++) {
            String flip = flip();
            if (flip.equals("tails")) {
                numTails++;
            } else {
                numHeads++;
            }
        }
        double percentHeads = (double) numHeads/numFlips;
        return percentHeads;
    }
}
