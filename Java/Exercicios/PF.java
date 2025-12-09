package Exercicios;

public class PF  extends Pessoa{
    
    private String cpf;
    private String dataNasc;
    private String genero;
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getDataNasc() {
        return dataNasc;
    }
    
    public String getGenero() {
        return genero;
    }

}
