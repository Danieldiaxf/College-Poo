package Constructor.application;
import java.util.Scanner;

import Constructor.entities.Product;

public class Program{

    public static void main( String[ ] args ){

    Scanner sc = new Scanner( System.in );

    System.out.println( "Enter product data: " );
    System.out.print( "Name:" );

    String name = sc.nextLine(  );
    
    System.out.print( "Price:" );
    double price = sc.nextDouble();
    
    Constructor.entities.Product product = new Product( name, price );


    System.out.println( product.toString(  ) );
    System.out.print( "Enter the number of products to be addes in stock: " );

    int quantity = sc.nextInt(  );
    product.addProducts( quantity );
   
    System.out.println( product.toString(  ) );


    System.out.println( product.toString(  ) );
    System.out.print( "Enter the number of products to be remove from stock: " );

    quantity = sc.nextInt(  );
    product.removeProducts( quantity );

    System.out.println( product.toString(  ) );

    sc.close();
    }

}

