/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Conta;
import banco.BancoDadosSistemaBancario;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ContasController {

    Scanner scan = new Scanner(System.in);

    public static void adicionarConta(int numero, String nome, float saldo) {
        // criei o objeto para ir para o banco
        Conta c = new Conta();

        // Preenchendo o objeto
        c.setNumero(numero);
        c.setNome(nome);
        c.setSaldo(saldo);

        BancoDadosSistemaBancario.getTabelaConta().add(c);
    }

    public static Conta buscarPorConta(int conta) {

        for (Conta c : BancoDadosSistemaBancario.getTabelaConta()) {
            if (c.getNumero() == conta) {
                return c;
            }
        }

        return null;
    }

    public static void depositar(int numero, float valor) {

        Conta c = ContasController.buscarPorConta(numero);
        
        

    }
}
