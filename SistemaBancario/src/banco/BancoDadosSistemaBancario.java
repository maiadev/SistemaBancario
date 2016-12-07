package banco;

import java.util.ArrayList;
import java.util.List;
import models.Usuario;
import models.Administrador;
import models.Conta;        
        
        
public class BancoDadosSistemaBancario {
    
    private static List<Usuario> tabelaUsuario;
    private static List<Saldo> tabelaSaldo;
    private static List<Extrato> tabelaExtrato;
    private static List<Conta> tabeltaConta;
    
    
    public static List<Usuario> getTabelaCliente() {
        return tabelaUsuario;
    }

    public static List<Conta> getTabelaConta() {
        return tabelaConta;
    }
    
    public static void inicializarBancoUsuario() {
        tabelaUsuario = new ArrayList<Usuario>();    
    }
        
    public static void inicializarBancoConta() {
        tabelaConta = new ArrayList<Conta>();
    }
    
}