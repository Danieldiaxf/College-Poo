import java.util.Scanner;
import java.math.*;

public class triangulo {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Insira as Medidas do triângulo X: " );

        double x1 = sc.nextDouble(  );
        double x2 = sc.nextDouble(  );
        double x3 = sc.nextDouble(  );
        double PX = ( ( x1 + x2 + x3 ) / 2 );


        System.out.println( "Insira as Medidas do triângulo Y: " );

        double y1 = sc.nextDouble(  );
        double y2 = sc.nextDouble(  );
        double y3 = sc.nextDouble(  );
        double PY = ( ( y1 + y2 + y3 ) / 2 );

        double areaY = Math.sqrt( PY * ( PY - y1 ) * ( PY - y2 ) * ( PY - y3 ) );

        double areaX = Math.sqrt( PX * ( PX - x1 ) * ( PX - x2 ) * ( PX - x3 ) );


        System.out.printf( "Área do triângulo x: %.2f\n", areaX );
        System.out.printf( "Área do triângulo y: %.2f\n", areaY );

        if ( areaX > areaY ) {
            System.out.println( "Maior Área = X" );
        }else {
            System.out.println( "Maior Área = Y" );
        }

        sc. close(  );
    }

}
