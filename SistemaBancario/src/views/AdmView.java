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

        System.out.print("Digite o nome do cliente: ");
        String nome = scan.nextLine();

        System.out.print("Digite o cpf do cliente: ");
        String cpf = scan.nextLine();

        ClientesController.adicionarCliente(cod, nome, cpf);
    }

    private static void alterarCliente() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o codigo do cliente: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Cliente c = ClientesController.buscarPorConta(conta);

        if (c != null) {
            System.out.print("Digite a nova conta do cliente: (anterior: " + c.getCodigo() + "): ");
            int contaCliente = scan.nextInt();
            scan.nextLine();
            c.setCodigo(contaCliente);

        } else {
            System.out.println("Cliente nao cadastrado!");
        }
    }

    private static void excluirCliente() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o codigo do cliente: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Cliente c = ClientesController.buscarPorConta(conta);

        if (c != null) {
            BancoDadosSistemaBancario.getTabelaCliente().remove(c);
            System.out.println("Cliente removido com sucesso");
        } else {
            System.out.println("Cliente não encontrado!!");
        }
    }

}
