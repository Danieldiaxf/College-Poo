public class Carro extends Automovel {
    
    public boolean arCondicionado;

    public void ligar(){

        System.out.println("Carro ligado" );

    }

    public boolean isArcondicionado(){

        return arCondicionado;

    }

    public void setArCondicionado( boolean arCondicionado ){


        this.arCondicionado = arCondicionado;

    }


}
