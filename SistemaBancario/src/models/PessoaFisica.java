
package models;

public class PessoaFisica extends Conta{

    private String Nome;
    private int Numero;
    
    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setNumero(int numero) {
        this.Numero = numero;
    }
    
}
