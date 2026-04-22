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
        return saldo;
    }


    public void deposito( double valor ) {
        saldo += valor;
    }

    public void saque( double valor ) {
        saldo -= valor - 5.00;
    }

}
