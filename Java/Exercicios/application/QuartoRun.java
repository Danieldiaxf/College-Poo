package Exercicios.application;

import java.util.Scanner;
import Exercicios.entities.PessoaQuarto;
public class QuartoRun {

    public static void main( String[ ] args ) {
     
        Scanner sc = new Scanner( System.in );

        // Criação de array quartos do tipo PessoaQuarto.
        PessoaQuarto quartos[ ] = new PessoaQuarto[ 10 ];

        System.out.print( "Quantos quartos serão alugados? " );
        // Input para a quantidade de quartos que serão alugados.
        int n = sc.nextInt( );

        if( n > 10 || n < 1 ) {
            System.out.println( "MIN = 1 & MAX = 10" );
            System.out.print( "Quantos quartos serão alugados? " );
            n = sc.nextInt( );
        }

        sc.nextLine( );


        for ( int i = 0; i < n; i++ ) {
            System.out.printf( "Aluguel #%d\n", i + 1 );
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print( "Quarto:" );
            // Input para o número do quarto a ser escolhido.
            int quarto = sc.nextInt( );

            sc.nextLine( );

            // 
            quartos[ quarto - 1 ] = new PessoaQuarto( nome, email );

        }

        System.out.println(  );

        for (int i = 0; i < quartos.length; i++) {
            System.out.println( quartos[ i ] );
        }

        sc.close(  );
    }

}
