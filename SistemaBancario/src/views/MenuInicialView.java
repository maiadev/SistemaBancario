/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

/**
 *
 * @author 1620928
 */
public class MenuInicialView {

    public class MenuInicioView {

        Scanner scan = new Scanner(System.in);

        public int Menu() {

            System.out.println("---------- Bem vindo ao Fernaron Bank ----------");
            System.out.println("Digite 1 para Cliente e 2 para Administrador:");

            int op = scan.nextInt();
            scan.nextLine();

            if (op == 1) {
                System.out.println("1 - Saldo;");
                System.out.println("2 - Extrato;");
                System.out.println("3 - Depósito;");
                System.out.println("4 - Saque;");
                System.out.println("5 - Sair;");
                System.out.print("Informe a opção desejada: ");
            }else{
                if(op == 2){
                    System.out.println("1 - Cadastrar Cliente;");
                    System.out.println("2 - Alterar Cliente;");
                    System.out.println("3 - Excluir Cliente;");
                    System.out.println("4 - Exibir Clientes;");
                    System.out.print("Informe a opção desejada: ");
                }else{
                    System.out.println("Opção digitada é inválida");
                }
            }

            
            System.out.print("Informe a opção desejada: ");

            int op = scan.nextInt();
            scan.nextLine();

            return op;

        }
    }
