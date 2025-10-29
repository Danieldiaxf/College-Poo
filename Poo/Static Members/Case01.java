import java.util.Scanner;

public class Case01 {

    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        Product product = new Product(  );

        System.out.println( "Enter product data: " );
        System.out.print( "Name: " );
        product.name = sc.nextLine(  );

        System.out.print( "Price: " );
        product.price = sc.nextDouble(  );

        System.out.print( "Quantity in stock: " );
        product.quantity = sc.nextInt(  );

        System.out.println();

        System.out.println( "Product Data: " + product );

        System.out.println();

        System.out.print( "Enter the quantity to be added in stock: " );
        int added = sc.nextInt(  );

        System.out.println( product.addProducts( added ) );

        System.out.println(  );

        System.out.printf( "Data update: %s", product );


        System.out.print( "Enter the quantity to be removed: " );
        int rmv = sc.nextInt(  );

        System.out.println( product.addProducts( rmv ) );

        System.out.println(  );

        System.out.printf( "Data update: %s", product );

        sc.close();
    }


}

