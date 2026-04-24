package Exercicios.application;

import java.util.Scanner;

public class VetorRun5 {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.print( " Valores que cada vetor terá: " );
        int n = sc.nextInt( );

        sc.nextLine( );


        int vetorA[ ] = new int[ n ];
        int vetorB[ ] = new int[ n ];
        int vetorC[ ] = new int[ n ];


        System.out.printf( "Digite os %d do vetor A: \n", n );

        for ( int i = 0; i < n; i++ ) {  
            vetorA[ i ] = sc.nextInt();
            sc.nextLine(  );
        }



        System.out.printf( "Digite os %d do vetor B: \n", n );

        for (int i = 0; i < n; i++) {
            vetorB[ i ] = sc.nextInt();
            sc.nextLine(  );
        }


        System.out.println( "Vetor Resultante" );

        for (int i = 0; i < n; i++) {
            vetorC[ i ] = vetorA[ i ] + vetorB[ i ];
            System.out.println( vetorC[ i ] );
        }


        sc.close( );
    }

}
