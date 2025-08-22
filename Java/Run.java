import java.util.Scanner;

public class Run {
    
    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        Employer employer = new Employer();

        employer.name = "Daniel";   
        employer.age = 20;
        employer.salary = 1556.00;



        sc.close(  ); 
    }


}
