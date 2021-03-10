package PrimeiraVersao;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Wallet {
	private ArrayList<Trade> wallet;

    public Wallet() {
        this.wallet = new ArrayList<Trade>();
    }

    public void addStock(Trade trade) {
        this.wallet.add(trade);
    }

    public void removeStock(Trade trade) {
        this.wallet.remove(trade);
    }

    public Stream findStock(String ticker) {
        return this.wallet.stream().filter(trade -> trade.getStockTicker().equals(ticker) );
    }

    public void getInfo(){
        for(Trade trade: wallet){
            System.out.println("Trade " + wallet.indexOf(trade));
            trade.printInfo();
        }
    }
}
