public class Wallet {

    private int fazCoin;
    private double USDollars;

    public Wallet(int fazCoin, double usDollars) {
        this.fazCoin = fazCoin;
        this.USDollars = usDollars;
    }

    public int getFazCoin() {
        return fazCoin;
    }

    public double getUSDollars() {
        return USDollars;
    }

    public void setFazCoin(int fazCoin) {
        this.fazCoin = fazCoin;
    }

    public void setUSDollars(double usDollars) {
        this.USDollars = usDollars;
    }

}
