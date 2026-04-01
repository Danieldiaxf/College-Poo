package entities;

public class Product {
    
    public String name;
    public Double price;
    public int quantity;

    public Product( ) {
    }

    public Product( String name, Double price, int quantity ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    
    public double totalValueInStock( ) {
        return price * quantity;
    }


    public void addProducts( int x ) {
        quantity += x;
    }


    public void removeProducts( int x ) {
        quantity -=  x;
    }


    public String toString(  ) {
        return name
            + ", $"
            + price
            + ", "
            + quantity
            + " , units, Total: $"
            + totalValueInStock( );
    }


}
