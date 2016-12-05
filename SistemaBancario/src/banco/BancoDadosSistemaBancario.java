/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1620928
 */
    public class BancoDadosSistemaBancario {
    
    private static List<PessoaFisica> tabelaPessoaFisica;

    public static List<PessoaFisica> getTabelaPessoaFisica() {
        return tabelaPessoaFisica;
    }
    
    public static void inicializarBanco(){
        tabelaPessoaFisica = new ArrayList<PessoaFisica>();
    }
    
}
