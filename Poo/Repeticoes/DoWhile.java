package Repeticoes;

import java.util.Scanner;

public class DoWhile {

    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        char x;

        do {  

            System.out.print( "Insira a temperatura em Celsius: " );
            double celsius = sc.nextDouble( );

            double form = ( ( 9 * celsius ) / 5 ) + 32;

            System.out.println( "Equivalente em Fahrenheit: " + form );

            System.out.print( "Deseja Repetir (s/n)?" );
            x = sc.next(  ).charAt(0);
            
        }while( x != 'n' );

        
        sc.close(  );
    }
}
