package Exercicios.application;

import java.util.Scanner;

public class Vetor2Run {
    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.print( "Quantidade a ser inserida: " );
        int n = sc.nextInt( );
        
        sc.nextLine( );

        double vetor[ ] = new double[ n ];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print( "Digite um número: " );
            vetor[ i ] = sc.nextInt( );
        }

        sc.nextLine( );

        for( int i = 0; i < vetor.length; i++ ) {
            System.out.print( vetor[ i ] + " " );
        }


        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[ i ];
        }

        System.out.println( "\nSoma: " + sum );
        System.out.println( "Média: " + sum / vetor.length );

        sc.close( );
    }
}
