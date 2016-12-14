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
    ClienteView clienteView = new ClienteView();
    AdmView admView = new AdmView();
    
    public void exibirMenu() {
        while (true) {
            int op = 0;
            do {
                op = Menu();
                switch (op) {
                    case 1:
                         try{
                            System.out.println("INFORME SUA O NÚMERO DA SUA CONTA");
                            int conta = scan.nextInt();
                            scan.nextLine();
                            Conta cc = controllers.ContasController.buscarPorConta(conta);
                            if(cc == null){
                                System.out.println("CONTA NÃO CADASTRADA");
                            }else{
                                 clienteView.exibirMenuCliente(cc);
                            }
                         }catch(Exception e){
                             System.out.println("Permitido apenas números");
                         }
                        
                        break;
                    case 2:
                        admView.exibirMenuAdm();
                        break;

                }
            } while (op != 3);
        }
    }

}
