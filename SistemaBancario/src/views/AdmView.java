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
        System.out.println("Informe a opção desejada: ");
        
        System.out.println("1 - Cadastrar Cliente;");
        System.out.println("2 - Alterar Cliente;");
        System.out.println("3 - Excluir Cliente;");
        System.out.println("4 - Exibir Clientes;");
        System.out.println("5 - Sair;");
        
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

    public void exibirMenuAdm() {
        
        int op = 0;
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
                case 5:
                    sistemaBancario.SistemaBancario.main(null);
                    break;
                default:
                    System.out.println("Opção digitada é inválida");
                    break;
            }
        } while (op != 6);
    }

    private void cadastrarCliente() {

        try{
            System.out.print("Digite a conta do cliente: ");
            int conta = scan.nextInt();
            scan.nextLine();

            System.out.print("Digite o numero da conta: ");
            int numero = scan.nextInt();
            scan.nextLine();

            System.out.print("Digite o nome do cliente: ");
            String nome = scan.nextLine();

            System.out.print("DIgite o saldo da conta: ");
            float saldo = scan.nextFloat();

            ContasController.adicionarConta(numero, nome, saldo);
        }catch(Exception e){
            System.out.println("Informação inválida");
        }
    }

    private static void alterarCliente() {
    try{
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
        }catch(Exception e){
            System.out.println("Informação inválida");
        }
        
    }

    private static void excluirCliente() {
        try{
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
        }catch(Exception e){
            System.out.println("Informação inválida");
        }
       
    }
    
    private void exibirClientes() {
        
        for (Conta a : BancoDadosSistemaBancario.getTabelaConta()) {
            System.out.println("********************************");
            System.out.println("    Codigo cliente: " + a.getNumero());
            System.out.println("    Nome cliente: " + a.getNome());
            System.out.println("    Saldo cliente" + a.getSaldo());
            System.out.println("********************************");
        }
        
    }

}
