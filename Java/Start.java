import java.util.Scanner;
public class Start{

    public static void main( String[] args ){

        Scanner sc = new Scanner(  System.in  );


        Rectangle rectangle = new Rectangle(  );

        System.out.print( "Enter the height of rectangle: " );
        rectangle.height = sc.nextDouble(  );

        System.out.print( "\n Enter the width of rectangle: " );
        rectangle.width = sc.nextDouble(  );


        rectangle.area( rectangle.height , rectangle.width );
        rectangle.perimeter( rectangle.width , rectangle.height );

        System.out.println( rectangle.toString() );

        sc.close( );
    }



}