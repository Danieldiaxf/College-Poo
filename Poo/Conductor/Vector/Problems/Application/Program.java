package Conductor.Vector.Problems.Application;

import java.util.Scanner;

import Conductor.Vector.Problems.entities.People;

public class Program {
    
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        System.out.print( "How many people will be added? " );
        int n = sc.nextInt(  );

        People[ ] people = new People[ n ];

        for( int i = 0; i < people.length; i++ ){

            System.out.printf( "Dados da %d pessoa: \n", i + 1 );  
            sc.nextLine();
            System.out.print( "name: " ); 
            String name = sc.nextLine( ); 
            System.out.print( "\nage: " ); 
            int age = sc.nextInt( ); 
            System.out.print( "\nheight: " ); 
            double height = sc.nextDouble( ); 
            System.out.println(  );
            people[ i ] = new People( name , age, height );
            System.out.println(  );

        }

        double sum = 0.0;

        for( int i = 0; i < people.length; i ++ ){
            sum += people[ i ].getHeight(  );
        }

        double avg = sum / people.length;
        System.out.println( avg );
    

        sc.close( );

    }

}
