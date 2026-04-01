package application;

import java.util.Scanner;

import Construtor.entities.Product;

public class ProgramProduct {
    
    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        Product product = new Product(  );

        System.out.print( "Insira o nome do produto: " );
        product.name = sc.nextLine(  );

        System.out.print( "Insira a quantidade do produto: " );
        product.quantity = sc.nextInt(  );

        System.out.print( "Insira o preço do produto: " );
        product.price = sc.nextDouble(  );
        System.out.println( );
        
        System.out.println( "### Dados do Produto ###" );

        System.out.printf( "Name: %s\n", product.name );
        System.out.printf( "Quantity: %d\n", product.quantity );
        System.out.printf( "Name: %.2f\n", product.price );
        System.out.println( "Total: " + product.totalValueInStock( ) );
        System.out.println(  );

        System.out.print( "Produtos a serem adicionados:" );
        int x = sc.nextInt( );
        product.addProducts(x);
        System.out.print( "Produtos a serem removidos:" );
        int y = sc.nextInt( );
        product.removeProducts(y);
        System.out.println(  );

        System.out.println( "### Dados Atualizados do Produto ###" );
        System.out.printf( "Name: %s\n", product.name );
        System.out.printf( "Quantity: %d\n", product.quantity );
        System.out.printf( "Name: %.2f\n", product.price );
        System.out.println( "Total: " + product.totalValueInStock( ) );

        sc.close(  );
    }


}
