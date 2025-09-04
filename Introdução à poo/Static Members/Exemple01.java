import java.util.Scanner;

import util.Calculator;

public class Exemple01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        Calculator calc = new Calculator();

        System.out.print( "Enter the radius:" );
        double radius = sc.nextDouble(  );

        double c = calc.circumference( radius );

        double v = calc.volume( radius );


        System.out.printf( "Circumference: %.2f", c );
        System.out.printf( "\nvolume: %.2f", v );
        System.out.printf( "\nPI value: %.2f", calc.PI );

        sc.close();

    }

}
