package Exercicios.application;

import java.util.Scanner;

import Exercicios.entities.Conta;

public class RunConta {

public static void main(String[] args) {
    
    Scanner sc = new Scanner( System.in );

    Conta conta1 = new Conta( 8532 );

    System.out.print( "Digite o nome do Titular: " );
    conta1.setNomeTitular( sc.nextLine(  ) );

    System.out.print( "Haverá depósito inicial (s/n)? " );
    String depIni = ( sc.nextLine( ) );

    if( depIni.equals( "s" ) ){

        System.out.print( "Digite o valor a ser depositado: " );
        conta1.setDepositoInicial( sc.nextDouble(  ) );
        System.out.println( "Saldo Atual: " + conta1.toString( ) );

    }else{

        System.out.println( "Sem valores a serem depositados!" );

    }


    System.out.print( "Insira o valor que será depositado: " );
    double add = sc.nextDouble( );
    conta1.deposito( add );

    System.out.print( "Insira o valor que será Sacado: " );
    double saq = sc.nextDouble( );
    conta1.saque( saq );

    System.out.println( conta1.toString( ) );

    sc.close( );
}

}
