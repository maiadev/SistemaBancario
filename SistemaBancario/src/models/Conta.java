
package models;
import controllers.ContasController;

public class Conta {

    private int Numero;
    private String Nome;
    private float Saldo;
    private int Extrato;
    
    public int getNumero() {
        return Numero;
    }

    public String getNome() {
        return Nome;
    }

    public float getSaldo() {
        return Saldo;
    }

    public int getExtrato() {
        return Extrato;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSaldo(float Saldo) {
        
        Conta c = new Conta();
        
        if (ContasController.depositar(int numero, float valor)){
            this.Saldo = Saldo + valor;
        }else{
            this.Saldo = Saldo - valor;
        }
        
    }

    public void setExtrato(int Extrato) {
        this.Extrato = Extrato;
    }
    
    
    
}