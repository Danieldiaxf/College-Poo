package Exercicios;
public class FuncionariosCLT extends Funcionarios{

    public double beneficio;

    
    public double calcularSalario( double x ){

        return beneficio;


    }

    public double setCalcularSalario( double beneficio ){


        this.beneficio = beneficio;

        return ( beneficio * getSalarioB(  ) ) + getSalarioB();

    }


    public double getBeneficio() {
        return beneficio;
    }




    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }


}