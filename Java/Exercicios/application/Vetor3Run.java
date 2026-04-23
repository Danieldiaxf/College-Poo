package Exercicios.application;

import java.util.Scanner;

import Exercicios.entities.PessoaVetor;

public class Vetor3Run {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Quantas pessoas serão inseridas? " );
        int n = sc.nextInt( );

        sc.nextLine( );

        PessoaVetor vetor[ ] = new PessoaVetor[ n ];

        for (int i = 0; i < vetor.length; i++) {
            vetor[ i ] = new PessoaVetor( );
            System.out.printf("Dados da %d pessoa: ", i + 1);
            System.out.print("Nome: ");
            vetor[ i ].setNome( sc.nextLine() );
            System.out.print("Idade: ");
            vetor[ i ].setIdade( sc.nextInt() );
            sc.nextLine( );
            System.out.print("Altura: ");
            vetor[ i ].setAltura( sc.nextDouble() );
            sc.nextLine( );
        }


        double sum = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[ i ].getAltura( );
        }

        System.out.printf( "Altura média: %.2f", sum / vetor.length );

        

        sc.close( );
    }

}
