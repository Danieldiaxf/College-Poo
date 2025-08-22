public class Rectangle{

    public double width;
    public double height;

    public double area( double x , double y ){

        return x * y;

    }


    public double perimeter( double x , double y ){

        return ( x + x ) * ( y + y );


}

    public double diagonal( double x , double y ){

        return Math.sqrt( ( x * x ) + ( y * y ) );

    }


    public String toString(   ){

        return 
        "Area = " + area(width, height) + "\n" + 
        "Perimeter = " + perimeter(width, height) + "\n" + 
        "Diagonal = " + diagonal(width, height);

    }

}