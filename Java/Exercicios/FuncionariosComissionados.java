package Exercicios;

public class FuncionariosComissionados extends Funcionarios {
    
    public double comissao;

    public double SalarioC( double x ){

        this.comissao = x;

        return x;


    }

    public double setSalarioC( double comissao ){

        this.comissao = comissao;

        return ( comissao * getSalarioB() );
        
    }



}
