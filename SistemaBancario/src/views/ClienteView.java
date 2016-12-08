/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

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
        System.out.println("|      3 - Exibir Clientes     |");
        System.out.println("|          4 - Sair            |");
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

        System.out.print("Seu saldo é de:");
        int conta = scan.nextInt();
        scan.nextLine();
        
        ClientesController.adicionarCliente(conta, PessoaFisica);
    }
}
