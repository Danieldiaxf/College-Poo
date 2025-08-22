// Cria-se uma nova classe chamda Protudo
public class Product {
    
    // A classe possuí 4 atributos
    public String name;
    public double price;
    public int quantity;

    // O valor do estoque = preço * quantidade
    public double totalValueInStock(){
        return price * quantity;
    }


    // Função para adicionar quantidade de um produto
    public void addProducts( int quantity ){

        this.quantity += quantity;


    }


    // Função para remover quantidade de um produto
    public void removeProducts( int quantity ){

        this.quantity -= quantity;

    }



    public String toString(  ){

        return "Product Data: " + name + 
        ", $ " + price + ", " + 
        quantity + " units, Total: " + 
        totalValueInStock(  );


    }



}
