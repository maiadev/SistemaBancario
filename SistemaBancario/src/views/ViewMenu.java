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
public class ViewMenu {
    
   public class MenuInicioView {
    Scanner scan = new Scanner(System.in);
    
   public int Menu(){
        
       
        System.out.println("---------- Bem vindo ao Fernaron Bank ----------");
        System.out.println("Digite 1 para Cliente e 2 para Administrador:");
        
        int op = scan.nextInt();
        scan.nextLine();
        
        //if()
        
        
        
        System.out.println("1 - Saldo;");
        System.out.println("2 - Extrato;");
        System.out.println("3 - Depósito;");
        System.out.println("4 - Saque;");
        System.out.println("5 - Pesquisar Cliente por codigo");
        System.out.println("6 - Voltar");
        System.out.print("Informe a opção desejada: ");
        
        int op = scan.nextInt();
        scan.nextLine();
        
        return op;
        
    }
}
