package banco;

import java.util.ArrayList;
import java.util.List;
import models.Conta;


public  class BancoDadosSistemaBancario {

    private static List<Conta> tabelaConta;
    //private static List<Deposito> tabelaDeposito;

    public static List<Conta> getTabelaConta() {
        return tabelaConta;
    }

    public static void inicializarBancoConta(){
        if(tabelaConta == null){
            tabelaConta =  new ArrayList<Conta>();
        }
    }
}

