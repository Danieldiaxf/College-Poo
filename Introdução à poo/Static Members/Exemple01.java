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


        System.out.printf( "The Circumference's value: %.2f", c );
        System.out.printf( "\nThe Volume's value : %.2f", v );
        System.out.printf( "\nThe PI has value: %.2f", calc.PI );

        sc.close();

    }

}
