/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;
import banco.BancoDadosSistemaBancario;
import controllers.ContasController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Conta;

/**
 *
 * @author Fernando e Aron
 */
public class ClienteView {

    Scanner scan = new Scanner(System.in);
    private int op;
    Conta conta;

    public int Menu() {
        
        System.out.println("Informe a opção desejada: ");
        System.out.println(" ______________________________ ");
        System.out.println("|         Fernaron Bank        |");
        System.out.println("|                              |");
        System.out.println("|         1 - Saldo            |");
        System.out.println("|         2 - Extrato          |");
        System.out.println("|         3 - Depositar        |");
        System.out.println("|         4 - Sacar            |");
        System.out.println("|         5 - Sair             |");
        System.out.println("|______________________________|");
        try{
            int op = scan.nextInt();
            scan.nextLine();
            return op;
        }catch(Exception e){
            System.out.println("Permitido apenas números");
            scan.nextLine();
            return 0;
        }
    }

    public void exibirMenuCliente(Conta conta) {
        this.conta = conta;
        
        int opcao = 0;
        do {
            try{
                opcao = Menu();

                switch (opcao){
                    case 1:
                        exibirSaldo();
                        break;
                    case 2:
                        exibirExtrato();
                        break;
                    case 3:
                        depositar();
                        break;
                    case 4:
                        sacar();
                        break;
                    case 5:
                        sistemaBancario.SistemaBancario.main(null);
                        break;
                }
            }catch(Exception e){
                System.out.println("Informação inválida");
            }
        } while (opcao != 6);
    }

    private void exibirSaldo() {
        System.out.println("Seu Saldo:");
        System.out.println("R$ " + conta.getSaldo()); 
    }

    private void exibirExtrato(){

        System.out.println("Seu Extrato");
        
            try {
                 ArrayList<String> list = conta.getExtrato();
                 System.out.println("--EXTRATO--CONTA: " + conta.getNumero());
                 if(list != null){
                    for (String e : list) {
                       System.out.println("-- " + e);
                     } 
                 }else{
                     System.out.println("Não houve movimentação ");
                 }
            } catch (Exception ex) {
               System.out.println(ex.getMessage());
            }
    }

    private void depositar(){
        System.out.println("Informe o valor do depósito:");
        float valor = scan.nextFloat();
        ContasController.depositar(conta, valor);
    }

    private void sacar(){
        System.out.println("Digite o valor a ser sacado: ");
        float valor = scan.nextFloat();
        ContasController.retirar(conta, valor);
    }
}
