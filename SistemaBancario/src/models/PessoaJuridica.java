
package models;

public class PessoaJuridica extends Conta{

     private String CNPJ;
   
     public String getCNPJ() {
        return CNPJ;
     }

     @Override
     public int getNumero() {
         return Numero;
     }
     
     public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
     }
    
    @Override
    public void setNumero(int numero) {
        this.Numero = numero;
      }
    
    
    
}
