import java.util.Scanner;

public class Run {
    
    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        Employer employer = new Employer();

        System.out.print( "Enter your name: " );
        employer.name = sc.nextLine(  );  
        System.out.print( "Enter your age: " ); 
        employer.age = sc.nextInt(  );
        System.out.print( "Enter your salary: " ); 
        employer.salary = sc.nextDouble(  );

        System.out.print( "Which the percentage to ncrease salary? " ); 
        employer.tax = sc.nextDouble(  );


        System.out.println( employer.toString(  ) );

        sc.close(  ); 
    }


}
