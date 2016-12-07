/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ClienteView {

    Scanner scan = new Scanner(System.in);

    public int Menu() {

        System.out.println("1 - Saldo;");
        System.out.println("2 - Extrato;");
        System.out.println("3 - Depósito;");
        System.out.println("4 - Saque;");
        System.out.println("5 - Sair;");
        System.out.print("Informe a opção desejada: ");

    }

    public void exibirMenuCliente() {
        int opcao;
        do {
            opcao = Menu();

            switch (op) {
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

}
