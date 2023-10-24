/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe20;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double valor, desconto;
        System.out.println("digite o valor do seu salário para saber o desconto "); 
        Scanner obj = new Scanner(System.in);
         valor =obj.nextDouble();
       if (valor <= 600){
           System.out.println("isento"); 
        }
       if ((valor > 600) && (valor <= 1200)){
           desconto = (valor * 0.2);
        System.out.println( " o desconto vai ser de  " + desconto + "total de " + (valor - desconto));
       }
       if ((valor > 1200) && (valor <= 2000)){
           desconto = (valor * 0.25);
        System.out.println( " o desconto vai ser de  " + desconto + "total de " + (valor - desconto));
    }
        if (valor > 2000){
       desconto = (valor * 0.30);
        System.out.println( " o desconto vai ser de  " + desconto + "total de " + (valor - desconto));
         
        }
    
}
}
    
