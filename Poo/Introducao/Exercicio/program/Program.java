package Exercicio.program;

import java.util.Scanner;

import Exercicio.entity.Funcionario;

public class Program {

    public static void main( String[  ] args ) {

        Scanner sc = new Scanner( System.in );

        Funcionario funcionario = new Funcionario( );

        System.out.print( "Name: " );
        funcionario.name = sc.nextLine( );

        System.out.print( "Salario Bruto: " );
        funcionario.salarioBruto = sc.nextDouble( );

        System.out.print( "Taxa: " );
        funcionario.taxa = sc.nextDouble( );

        System.out.println(  );

        System.out.println( funcionario );

        System.out.println( );

        System.out.println( funcionario.toStringSalario( ) );
        sc.close();
    }


}
