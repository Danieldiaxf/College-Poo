
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


        FuncionariosComissionados Pedro = new FuncionariosComissionados();
        Pedro.setIdade(20);
        Pedro.setCpf("0147852336");
        Pedro.setSalarioB(3000);
        Pedro.setSalarioC(2000);

        System.out.println( Pedro.setSalarioC( Pedro.comissao ));
        

        sc.close();
    }


}
