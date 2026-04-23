package Comportamento.Vetor.Application;

import java.util.Scanner;

public class Program {
    
    public static void main( String[ ] args ) {
        
    
    Scanner sc = new Scanner( System.in );

    // Tamnnho do vetor a ser inserido peo usuário
    System.out.print( "Quantas alturas deseja inserir: " );
    int n = sc.nextInt( );

    // Instanciação de um vetor chamado vetor
    // Tipo de Dado[ ] + Nome do vetor = new Tipo de Dado[ tamanho da estrutura ]
    double[ ] vetor = new double[ n ];

    // Laço para percorrer os indices do vetor
    for( int i = 0; i < n; i++ ){
        vetor[ i ] = sc.nextDouble( );
    }

    double sum = 0.0;

    for( int i = 0; i < n; i++ ){
        sum += vetor[ i ];
    }

    double avg = sum / n;

    System.out.printf( "Médias das Alturas: %.2f%n", avg );

    sc.close();

    }
}
