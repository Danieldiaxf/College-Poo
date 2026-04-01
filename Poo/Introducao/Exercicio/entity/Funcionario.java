package Exercicio.entity;

public class Funcionario {

    public String name;
    public Double salarioBruto;
    public Double taxa;


    public Funcionario( ) {
    }


    public Funcionario( String name, Double salarioBruto, Double taxa ) {
        this.name = name;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    
    public double salarioLiquido(  ) {
        return salarioBruto = salarioBruto - ( ( salarioBruto / 100 ) * taxa ); 
    }


    @Override
    public String toString( ) {
        return "Funcionario [ name : " + name + ", salarioBruto : " + salarioBruto + ", taxa : " + taxa + " ]";
    }

    public String toStringSalario(  ){
        return "Funcionario [ name : " + name + " $ " + salarioLiquido() + " ]";
    }
}
