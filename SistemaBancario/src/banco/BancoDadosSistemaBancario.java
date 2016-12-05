package banco;

import java.util.ArrayList;
import java.util.List;
import models.Cliente;
import models.Administrador;
import models.Agencia;        
        
        
public class BancoDadosSistemaBancario {
    
    private static List<Cliente> tabelaCliente;
    private static List<Administrador> tabelaLanche;
    private static List<Venda> tabelaVenda;
    
    public static List<Cliente> getTabelaCliente() {
        return tabelaCliente;
    }

    public static List<Agencia> getTabelaAgencia() {
        return tabelaAgencia;
    }
    
    public static void inicializarBancoCliente() {
        tabelaCliente = new ArrayList<Cliente>();    
    }
        
    public static void inicializarBancoAgencia() {
        tabelaCliente = new ArrayList<Agencia>();
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*private static List<PessoaFisica> tabelaPessoaFisica;

    public static List<PessoaFisica> getTabelaPessoaFisica() {
        return tabelaPessoaFisica;
    }
    
    public static void inicializarBanco(){
        tabelaPessoaFisica = new ArrayList<PessoaFisica>();
        }
     */

