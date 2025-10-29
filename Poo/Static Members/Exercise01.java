import java.util.Scanner;

public class Exercise01 {
    
    public static void main( String[ ] args ) {
        
        Scanner sc = new Scanner( System.in );

        System.out.print( "what's the dollar price now: " );
        double value = sc.nextDouble(  );

        System.out.print( "\nHow many dollars will be bought: " );
        double quantity = sc.nextDouble(  );

        System.out.printf( "Amount to be paid in reais = %.2f ", CurrencyConverter.calc( value * quantity )  ); 





        sc.close();
    }


}
