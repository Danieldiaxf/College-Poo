package Exercicios.entities;

public class Conta {

    private final long id;
    private String nomeTitular;
    private double depositoInicial;
    private double saldo;


    public Conta( long id ) {
        this.id = id;
    }


    public Conta( long id, String nomeTitular, double depositoInicial, double saldo ) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
        this.saldo = saldo;
    }


    public long getId( ) {
        return id;
    }


    public String getNomeTitular( ) {
        return nomeTitular;
    }


    public void setNomeTitular( String nomeTitular ) {
        this.nomeTitular = nomeTitular;
    }


    public double getDepositoInicial( ) {
        return depositoInicial;
    }


    public void setDepositoInicial( double depositoInicial ) {
        this.depositoInicial = depositoInicial;
    }


    public double getSaldo( ) {
        return saldo + depositoInicial;
    }


    public void deposito( double valor ) {
        saldo = saldo + valor;
    }

    public void saque( double valor ) {
        saldo = saldo - valor - 5.00;
    }


    @Override
    public String toString() {
        return "Conta [Número da conta: " + getId() + 
        ", Nome do Titular: " + getNomeTitular() + 
        ", Saldo da Conta: " + getSaldo() + "]";
    }

}
