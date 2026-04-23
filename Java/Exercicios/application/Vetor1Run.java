package Exercicios.application;

import java.util.Scanner;

public class Vetor1Run {
    
    public static void main( String[  ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.print( "Quantidade de números a ser inserido: " );
        int n = sc.nextInt( );

        sc.nextLine( );


        int vetor[ ] = new int[ n ];


        for( int i = 0; i < vetor.length; i++ ) {
            System.out.print( "Digite um número: " );
            vetor[ i ] = sc.nextInt( );
            sc.nextLine( );
        }

        for ( int i = 0; i < vetor.length; i++ ) {
            if( vetor[ i ] < 0 ){
                System.out.println( "Números negativos: " );
                System.out.println( vetor[ i ] );
            }
        }

        sc.close(  );
    }


}
