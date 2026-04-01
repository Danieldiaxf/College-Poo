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

        System.out.println( product.toSring( ) );

        System.out.print( "Número de produtos a serem adicionados ao estoque: " );
        int qtd = sc.nextInt();
        product.addProducts( qtd );

        System.out.println( );

        System.out.println( product.toSring( ) );

        System.out.print( "Número de produtos a serem removidos do estoque: " );
        int rmv = sc.nextInt();
        product.addProducts( rmv );

        System.out.println( );

        System.out.println( product.toSring( ) );
        
        sc.close(  );
    }


}
