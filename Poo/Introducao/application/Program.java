package application;

import java.util.Scanner;

import entities.Triangulo;
import entities.TrianguloPoo;

public class Program {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        TrianguloPoo x , y;

        x = new TrianguloPoo(  );
        System.out.println( "Insira as medidas do triângulo X:" );
        x.l1 = sc.nextDouble();
        x.l2 = sc.nextDouble();
        x.l3 = sc.nextDouble();

        System.out.println( "Insira as medidas do triângulo Y:" );
        y = new TrianguloPoo(  );
        y.l1 = sc.nextDouble(  );
        y.l2 = sc.nextDouble(  );
        y.l3 = sc.nextDouble(  );

        double p = ( x.l1 + x.l2 + x.l3 ) / 2.0;
        double areaX = Math.sqrt( p * ( p - x.l1 ) * ( p - x.l2 ) * ( p - x.l3 ) ); 


        p = ( y.l1 + y.l2 + y.l3 ) / 2.0;
        double areaY = Math.sqrt( p *  ( p - y.l1 ) * ( p - y.l2 ) * ( p - y.l3 ) );


        System.out.printf( "Area do Triangulo X: %.3f\n", areaX );
        System.out.printf( "Area do Triangulo Y: %.3f:\n", areaY );

        if( areaX > areaY ) {
            System.err.println( "Area X > Area Y" );
        } else {
            System.err.println( "Area Y > Area X" );
        }

        sc.close(  );
    }

}
