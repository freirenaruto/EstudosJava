package PrimeiraVersao;

import java.util.UUID;

public class User {
	private final String id;
    private String name;
    private String email;
    public Wallet wallet;

    public User(String name, String email) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.wallet = new Wallet();
    }

    public void getInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
