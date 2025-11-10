package Exercicios;

public class Automovel {
    
    private String marca;
    private String modelo;

    public void ligar(  ){

        System.out.println("Automóvel ligado!");

    }

    public void ligar( boolean puxouAfogador ){

        if( puxouAfogador ){

            ligar(  );

        }else{

            System.out.println("Carro afogou!");

        }



    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



}
