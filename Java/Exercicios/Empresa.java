
package Exercicios;

import java.util.Scanner;

public class Empresa {
    
    public static void main( String[] args ){

        Scanner sc = new Scanner( System.in );

        FuncionariosCLT Daniel = new FuncionariosCLT();
        Daniel.setIdade( 20 ); 
        Daniel.setCpf( "09184151102" ); 
        Daniel.setSalarioB( 2000 ); 
        Daniel.setBeneficio( 0.1 );

        System.out.println( Daniel.setCalcularSalario( Daniel.beneficio ) );
        

        sc.close();
    }


}
