package PrimeiraVersao;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
        User user1 = new User("Jonatas", "jonatas@hotmail.com");
        User user2 = new User("Elisabeth", "elisa@hotmail.com");

        Stock stock1 = new Stock("WEGE3");
        Stock stock2 = new Stock("MGLU3");

        user1.wallet.addStock(new Trade("Long", stock2, 10.00, 200));
        user1.wallet.addStock(new Trade("Long", stock1, 10.00, 500));

        user1.wallet.getInfo();

        Stream t = user1.wallet.findStock("WEGE3");
        System.out.println(t);

	}

}
