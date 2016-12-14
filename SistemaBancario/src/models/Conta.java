
package models;
import controllers.ContasController;
import java.util.ArrayList;

public class Conta {

    private int Numero;
    private String Nome;
    private float Saldo;
    private ArrayList<String> Extrato;
    
    public int getNumero() {
        return Numero;
    }

    public String getNome() {
        return Nome;
    }

    public float getSaldo() {
        return Saldo;
    }

    public ArrayList<String> getExtrato() {
        return Extrato;
    }
    
     public void inicializarExrato() {
        Extrato = new ArrayList<String>();
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo + this.Saldo;
    }
    
    public void debitaSaldo(float valor) {
        this.Saldo =  this.Saldo - valor;
    }

}