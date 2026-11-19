public class CryptoWallet {
    private String owner;
    private double usdtBalance;
    private double btcBalance = 0;

    CryptoWallet(String owner,double usdtBalance) {
        this.owner = owner;
        this.usdtBalance = usdtBalance;
        if (usdtBalance<0) {
            this.usdtBalance = 0;
        } else {
            this.usdtBalance = usdtBalance;
        }
    }

    public String getOwner() {
        return owner;
    }
    public double getUsdBalance() {
        return usdtBalance;
    }
    public double getBtcPrice() { return BTC_PRICE; }
    public double getFeeRate() { return FEE_RATE; } // Комиссия для BingX
    public double getBtcBalance() { return btcBalance; }

    private static final double BTC_PRICE = 50000.0;
    private static final double FEE_RATE = 0.01; // 1% комиссия


    public boolean buyBTC(double amount) {
        double cost = amount * BTC_PRICE;
        double fee = cost*FEE_RATE;
        double totalCost = cost + fee;
        if (amount <= 0 || usdtBalance < totalCost) {
            return false;
        }

        usdtBalance -= totalCost;
        btcBalance += amount;
        return true;
    }

    public boolean sellBtc(double amount) {
        double cost = amount*BTC_PRICE;
        double fee = cost*FEE_RATE;
        double totalCost = cost - fee;
        if (amount<=0 || amount>btcBalance) {
            return false;
        }
        btcBalance -= amount;
        usdtBalance += totalCost;
        return true;
    }

    public boolean transferUsd(CryptoWallet target, double amount) {
        if (amount > 0 && this.usdtBalance >= amount) {
            this.usdtBalance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferBtc(CryptoWallet target, double amount) {
        if (target != null && amount > 0 && this.btcBalance >= amount) {
            this.btcBalance -= amount;
            target.btcBalance += amount;
            return true;
        }
        return false;
    }

    public String showStatus() {
        return "Владелец: " + owner + "\nБаланс: " + usdtBalance + "$" + "\nBTC: " + btcBalance;
    }
}
