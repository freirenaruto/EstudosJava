package PrimeiraVersao;

import java.util.Date;

public class Trade {
    private String operationType;
    private Stock stock;
    private double price;
    private int amount;
    private Date date;
    private String status;

    public Trade(String operationType, Stock stock, double price, int amount, Date date) {
        this.operationType = setOperationType(operationType);
        this.stock = stock;
        this.price = price;
        this.amount = amount;
        this.date = date;
        this.status = "Open";
    }

    public Trade(String operationType, Stock stock, int amount, Date date) {
        this.operationType = setOperationType(operationType);
        this.stock = stock;
        this.price = stock.getValue();
        this.amount = amount;
        this.date = date;
        this.status = "Open";
    }

    public Trade(String operationType, Stock stock, double price, int amount) {
        this.operationType = setOperationType(operationType);
        this.stock = stock;
        this.price = price;
        this.amount = amount;
        this.date = new Date();
        this.status = "Open";
    }

    public Trade(String operationType, Stock stock, int amount) {
        this.operationType = setOperationType(operationType);
        this.stock = stock;
        this.price = stock.getValue();
        this.amount = amount;
        this.date = new Date();
        this.status = "Open";
    }

    private String setOperationType(String operationType) {
        if (operationType.equals("long") ||
                operationType.equals("short") ||
                operationType.equals("Long") ||
                operationType.equals("Short")
        ) {
            return operationType;
        } else return "Long";
    }

    public void setStatusClosed() {
        this.status = "Closed";
    }

    public void setStatusOpen() {
        this.status = "Open";
    }

    public String getStockTicker(){
        return this.stock.getTicker();
    }

    public void printInfo(){
        System.out.println("Operation Type: " + this.operationType);
        System.out.println("Stock: " + this.stock.getTicker());
        System.out.println("Price: " + this.price);
        System.out.println("Amount: " + this.amount);
        System.out.println("Date: " + this.date);
        System.out.println("Status: " + this.status);
        System.out.println();
    }
}
