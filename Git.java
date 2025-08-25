public class Git {
    
    private String name;
    private String marca;
    private int cor;

    public void ligar(  ){

        System.out.println( "Carro ligado" );

    }
    public void ligar( boolean puxouAfogador  ){

        if( puxouAfogador ){

            ligar(  );

        }else{

            System.out.println( "Carro afogou!" );

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public int getCor() {
        return cor;
    }
    public void setCor(int cor) {
        this.cor = cor;
    }
    


}
