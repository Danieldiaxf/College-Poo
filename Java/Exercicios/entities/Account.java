package Exercicios.entities;

public class Account {
    //Attributes
    private int number;
    private String holder;
    private double balance;

    //Constructor - 1
    public Account( int number, String holder ) {
        this.number = number;
        this.holder = holder;
    }

    // Constructor - 2
    public Account( int number, String holder, double initialDeposit ) {
        this.number = number;
        this.holder = holder;
        deposit( initialDeposit );
    }

    //Method 
    public int getNumber( ) {
        return number;
    }

    //Method 
    public String getHolder( ) {
        return holder;
    }
    //Method 
    public void setHolder( String holder ) {
        this.holder = holder;
    }

    //Method 
    public double getBalance( ) {
        return balance;
    }
    

    public void deposit( double amount ){
        balance += amount;
    }

    public void withdraw( double amount ){
        balance -= amount + 5.0;
    }
    

    public String toString(  ){
        return "Account "
        + number
        + ", Holder: "
        + holder
        + ", Balance: $ "
        + String.format( "%.2f", balance );
    }

}