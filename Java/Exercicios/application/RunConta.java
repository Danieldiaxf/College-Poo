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
    String depIni = ( sc.nextLine(  ) );

    if( depIni.toLowerCase() == "y" ){
        System.out.print( "Digite o valor a ser depositado: " );
        conta1.setDepositoInicial( sc.nextDouble(  ) );
    }else{
        System.out.println( "Sem valores a serem depositados!" );
    }

    sc.close( );
}

}
