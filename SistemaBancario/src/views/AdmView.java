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
public class AdmView {

    Scanner scan = new Scanner(System.in);

    public int Menu() {

        int op = scan.nextInt();
        scan.nextLine();

        System.out.println("1 - Cadastrar Cliente;");
        System.out.println("2 - Alterar Cliente;");
        System.out.println("3 - Excluir Cliente;");
        System.out.println("4 - Exibir Clientes;");
        System.out.println("5 - Sair;");
        System.out.print("Informe a opção desejada: ");

        return op;
    }

    public void exibirMenuAdm() {
        int op;
        do {
            op = Menu();

            switch (op) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    alterarCliente();
                    break;
                case 3:
                    excluirCliente();
                    break;
                case 4:
                    exibirClientes();
                    break;
                default:
                    System.out.println("Opção digitada é inválida");
                    break;
            }
        } while (op != 6);
    }

    private void cadastrarCliente() {

        System.out.print("Digite a conta do cliente: ");
        int conta = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        
        System.out.println("DIgite o saldo da conta: ");
        float saldo = scan.nextFloat();

        ContasController.adicionarConta(numero, nome, saldo);
    }

    private static void alterarCliente() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o codigo do cliente: ");
        int conta = scan.nextInt();
        scan.nextLine();

        Conta c = ContasController.buscarPorConta(conta);

        if (c != null) {
            System.out.print("Digite a nova conta do cliente: (anterior: " + c.getNumero() + "): ");
            int contaCliente = scan.nextInt();
            scan.nextLine();
            c.setNumero(contaCliente);

        } else {
            System.out.println("Cliente nao cadastrado!");
        }
    }

    private static void excluirCliente() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o codigo do cliente: ");
        int conta = scan.nextInt();
        scan.nextLine();

        Conta c = ContasController.buscarPorConta(conta);

        if (c != null) {
            BancoDadosSistemaBancario.getTabelaConta().remove(c);
            System.out.println("Cliente removido com sucesso");
        } else {
            System.out.println("Cliente não encontrado!!");
        }
    }
    
    private void exibirClientes() {

        System.out.println("********************************");
        
        for (Conta a : BancoDadosSistemaBancario.getTabelaConta()) {

            System.out.println("Codigo cliente: " + a.getNumero());
            System.out.println("Nome cliente: " + a.getNome());
            System.out.println("Saldo cliente" + a.getSaldo());
            System.out.println("Extrato cliente" + a.getExtrato());
           
        }
        System.out.println("********************************");
    }

}
