package Conductor.Vector.Problems.Application;

import java.util.Scanner;

public class Main {
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Quantos números voce vai digitar? " );
        int n = sc.nextInt();

        if( n > 10 ){
            System.out.print( "Quantos números voce vai digitar? " );
            n = sc.nextInt();  
        }

        int[  ] vect = new int[ n ];

        System.out.println( "Números Negativos:" );

        for( int i = 0; i < vect.length; i++ ){
            System.out.print( "Digite um número: " );
            vect[ i ] = sc.nextInt( );
        }


        for( int i = 0; i < vect.length; i++ ){
            if( vect[ i ] < 0 ){
                System.out.println( vect[ i ] );
            }
        }


        sc.close();

    }
}
