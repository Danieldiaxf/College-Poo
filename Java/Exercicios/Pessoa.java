package Exercicios;

public class Pessoa{


    private String nome;
    private Number telefone;
    public String endereco;
    
    public String getNome() {
        return nome;
    }
    
    public Number getTelefone() {
        return telefone;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelefone(Number telefone) {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}