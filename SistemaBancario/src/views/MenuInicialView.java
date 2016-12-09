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
 * @author 1620928
 */
public class MenuInicialView {

    Scanner scan = new Scanner(System.in);

    public int Menu() {

        System.out.println("---------- Bem vindo ao Fernaron Bank ----------");
        System.out.println("Digite 1 para Cliente e 2 para Administrador:");

        int op = scan.nextInt();
        scan.nextLine();

        return op;
    }

    public void exibirMenu() {
        while (true) {
            int op = 0;
            do {
                op = Menu();
                switch (op) {
                    case 1:
                        clienteView.exibirMenuCliente();
                        break;
                    case 2:
                        admView.exibirMenuAdm();
                        break;

                }
            } while (op != 3);
        }
    }

}
