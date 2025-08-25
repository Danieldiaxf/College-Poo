public class Git {
    
    private String name;
    private String marca;
    private int cor;

    public void ligar( String x ){

        this.marca = x;

        System.out.printf( "%s ligou", x );

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
