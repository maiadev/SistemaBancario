/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Conta;
import banco.BancoDadosSistemaBancario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    public static Conta buscarPorConta(int num) {
            System.out.println(num + " aaa");
        for (Conta c : BancoDadosSistemaBancario.getTabelaConta()) {
            System.out.println(c.getNumero());
            if (c.getNumero() == num) {
                return c;
            }
        }

        return null;
    }

    public static void depositar(Conta c, float valor) {
        c.setSaldo(valor);
        inserirNoExtrato(c,getCurrentTime() + " | DEPÓSITO R$ " + valor);
    }
    
    public static void retirar(Conta c, float valor) {
        c.debitaSaldo(valor);
                
        inserirNoExtrato(c,getCurrentTime() + " | RETIRADA R$ -" + valor);
    }
        
    public static ArrayList<String> obterExtrato(Conta conta) throws Exception {
        return conta.getExtrato();
    }
    
    private static void inserirNoExtrato(Conta c,String msg){
        if(c.getExtrato() == null){
            c.inicializarExrato();
        }
        
        c.getExtrato().add(msg);
    } 
    
    public static String getCurrentTime() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
    return strDate;
}
}
