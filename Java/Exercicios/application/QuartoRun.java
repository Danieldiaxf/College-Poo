package Exercicios.application;

import java.util.Scanner;
import Exercicios.entities.PessoaQuarto;
public class QuartoRun {

    public static void main( String[ ] args ) {
     
        Scanner sc = new Scanner( System.in );

        PessoaQuarto quartos[ ] = new PessoaQuarto[ 10 ];

        System.out.println( "Quantos quartos serão alugados?" );
        int n = sc.nextInt( );

        sc.nextLine( );


        for ( int i = 0; i < n; i++ ) {
            System.out.printf( "Aluguel #%d\n", i + 1 );
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("\nEmail: ");
            String email = sc.nextLine();

            System.out.print( "Quarto:" );
            int quarto = sc.nextInt( );

            quartos[ quarto ] = new PessoaQuarto( nome, email );

        }





        sc.close(  );
    }

}
