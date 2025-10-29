import java.util.Scanner;

public class Exemple01 {

    public static void main( String[ ] args ) {
        
        Scanner sc = new Scanner( System.in );

        System.out.print( "Enter the radius:" );
        double radius = sc.nextDouble(  );

        double c = Calculator.circumference( radius );

        double v = Calculator.volume( radius );

        System.out.printf( "The Circumference's value: %.2f", c );
        System.out.printf( "\nThe Volume's value : %.2f", v );
        System.out.printf( "\nThe PI has value: %.2f", Calculator.PI );

        sc.close(  );

    }

}
