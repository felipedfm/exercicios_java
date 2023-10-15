/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x;
        System.out.println("digite um numero ");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        if (x<20){
            System.out.println("o numero é menor que 20");
        
    }
        if (x==20){
            System.out.println("o numero é igual a 20");
}
        if (x>20){
            System.out.println("o numero é maior que 20");
      
    }
    }
    
}
