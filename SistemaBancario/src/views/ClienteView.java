/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;
import banco.BancoDadosSistemaBancario;
import controllers.ContasController;
import models.Conta;

/**
 *
 * @author Fernando e Aron
 */
public class ClienteView {

    Scanner scan = new Scanner(System.in);
    private int op;

    public int Menu() {

        System.out.println(" ______________________________ ");
        System.out.println("|         Fernaron Bank        |");
        System.out.println("|                              |");
        System.out.println("|          1 - Saldo           |");
        System.out.println("|         2 - Extrato          |");
        System.out.println("|        3 - Depositar         |");
        System.out.println("|          4 -Sacar            |");
        System.out.println("|          6 - Sair            |");
        System.out.println("|______________________________|");
        System.out.print("Informe a opção desejada: ");
        return 0;

    }

    public void exibirMenuCliente() {
        int opcao;
        do {
            opcao = Menu();

            switch (op){
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
            }
        } while (opcao != 5);
    }

private void exibirSaldo() {

        System.out.print("Digite sua conta:");
        int conta = scan.nextInt();
        scan.nextLine();
        
        ContasController.adicionarCliente(conta, saldo);
    }

private void exibirExtrato(){
    
    System.out.println("Seu extrato:");
    int conta = scan.nextInt();
    scan.nextLine();
    
    ContasController.adicionarCliente(conta, extrato);
}

private void depositar(){
    
    System.out.println("Informe a conta para depósito: ");
    int numero = scan.nextInt();
    scan.nextLine();
    
    System.out.println("Informe o valor do depósito:");
    float valor = scan.nextFloat();
    
    
    ContasController.depositar(int numero, float valor);
    
}

private void sacar(){
    
    System.out.println("Digite o valor a ser sacado: ");
    















}
