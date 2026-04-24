package Exercicios.application;

import java.util.Scanner;

public class VetorRun4 {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.print( "Quantos números você vai digitar? " );
        int n = sc.nextInt( );

        sc.nextLine( );
        

        int vetor[ ] = new int[ n ];


        for ( int i = 0; i < vetor.length; i++ ) {
            System.out.print( "Digite um número: " );
            vetor[ i ] = sc.nextInt( );
            sc.nextLine( );
        }

        System.out.print( "Numeros Pares:" );

        for ( int i = 0; i < vetor.length; i++ ) {
            if ( vetor[ i ] % 2 == 0 ) {
                System.out.print( " " + vetor[ i ] );
            } else {
                
            };
        }


        int total = 0;

        System.out.print( "\nQuantidade de pares: " );

        for ( int i = 0; i < vetor.length; i++ ) {
            if ( vetor[ i ] % 2 == 0 ) {
                total = total + 1;
            } else {
                
            };
        }

        System.out.print( total );

        sc.close(  );
    }

}
