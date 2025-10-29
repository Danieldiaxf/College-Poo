package Conductor.Vector.Application;

import java.util.Scanner;

import Conductor.Vector.entities.Product2;

public class Program2 {
    
    public static void main( String[ ] args ) {
        
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt( );

        Product2[ ] vect = new Product2[ n ];

        for( int i = 0; i < vect.length; i++ ){
            sc.nextLine( );
            String name = sc.nextLine( );
            double price = sc.nextDouble( );
            vect[ i ] = new Product2( name, price );
        }

        double sum = 0.0;

        for( int i = 0; i < vect.length; i++ ){
            sum += vect[ i ].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf( "Average Price = %.2f", avg );

    }

}