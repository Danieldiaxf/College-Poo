package Exercicios.application;

import java.util.Scanner;

import Exercicios.entities.Account;

public class Program {
    
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        Account account;

        System.out.print( "Enter acount number: " );
        int number = sc.nextInt( );

        System.out.println( "Enter acount holder: " );
        sc.nextInt( );
        String holder = sc.nextLine();

        System.out.print( "Is there an initial deposit (y/n)? " );
        char reponse = sc.next().charAt( 0 );

        if( reponse == 'y' ){
            System.out.print( "Enter initial deposit value: " );
            double initialDeposit = sc.nextDouble( );
            account = new Account( number, holder, initialDeposit );
        }
        else{
            account = new Account( number, holder );
        }

        System.out.println();
        System.out.println( "Account data: " );
        System.out.print( account );

        System.out.println();
        System.out.print( "Enter a deposit value: " );
        double depositValue = sc.nextDouble( );
        account.deposit( depositValue );
        System.out.println( "Update account data:" );
        System.out.println( account );

        System.out.println();
        System.out.print( "Enter a withdraw value: " );
        double withdrawValue = sc.nextDouble( );
        account.withdraw( withdrawValue );
        System.out.println( "Updated account data: " );
        System.out.println( account );

        sc.close(); 
    }

}
