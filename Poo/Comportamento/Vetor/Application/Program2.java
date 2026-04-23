package Comportamento.Vetor.Application;

import java.util.Scanner;

import Comportamento.Vetor.entities.Produto2;


public class Program2 {
    
    public static void main( String[ ] args ) {
        
        Scanner sc = new Scanner( System.in );

        System.out.print( "Quantos produtos a serem adicionados: " );
        int n = sc.nextInt(  );

        sc.nextLine();

        // Cria o Array produto
        Produto2 produto[ ] = new Produto2[ n ];

        for( int i = 0; i < n; i++ ){
            // Instanciação do produto[i] como Produto2
            produto[ i ] = new Produto2( );
            System.out.printf( "Nome do %d produto: ", i + 1 );
            produto[ i ].setNome( sc.nextLine( ) );
            System.out.print( "Seu preço: ");
            produto[ i ].setPreco( sc.nextDouble( ) );
            sc.nextLine( );
        }

        double soma = 0.0;


        for( int i = 0; i < produto.length; i++ ){
            soma += produto[ i ].getPreco();
        }

        for (int i = 0; i < produto.length; i++) {
            System.out.println( produto[ i ].getNome( ) +": " +produto[ i ].getPreco( ) );
        }
        System.out.println( soma / produto.length );

        sc.close();
    }

}