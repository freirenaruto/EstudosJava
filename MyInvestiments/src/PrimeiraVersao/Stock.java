package PrimeiraVersao;

import java.text.DecimalFormat;
import java.util.Random;

public class Stock {
	private String ticker;
    private double value;

    public Stock(String ticker, double value) {
        this.ticker = ticker;
        this.value = value;
    }

    public Stock(String ticker) {
        this.ticker = ticker;
        this.value = this.generateDouble();
    }

    private double generateDouble(){
        Random random = new Random();
        return random.nextDouble() * 100;
    }

    public void getInfo() {
        System.out.println("Ticker: " + this.ticker);
        this.printValue();
    }

    private void printValue() {
        DecimalFormat f = new DecimalFormat("00.##");
        System.out.println("Value: " + f.format(this.value));
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
