package Repeticoes;

import java.util.Scanner;

public class Foor{
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "Total de números a serem inseridos: " );
        int x = sc.nextInt( );
        int soma = 0;

        for( int n = 1; n <= x; n++ ) {
            
            int y = sc.nextInt( );
            soma += y;
  
        }

        System.out.println( soma );

        sc.close();
    }
}