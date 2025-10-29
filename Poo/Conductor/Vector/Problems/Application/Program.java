package Conductor.Vector.Problems.Application;

import java.util.Scanner;

public class Program {
    
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "How many people will be added? " );
        int n = sc.nextInt(  );

        String[ ] people = new String[ n ];

        for( int i = 0; i < people.length; i++ ){

            System.out.printf( "Dados da %d pessoa", i );
            

        }



        sc.close( );

    }

}
