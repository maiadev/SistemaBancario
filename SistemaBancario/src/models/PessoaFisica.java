
package models;

public class PessoaFisica extends Conta{

    private String Nome;
    //como puxa de conta para ca como se fosse aquele negocio de herança?
    
    public String getNome() {
        return Nome;
    }

    @Override
    public int getNumero() {
        return Numero;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    @Override
    public void setNumero(int numero) {
        this.Numero = numero;
    }
    
}
