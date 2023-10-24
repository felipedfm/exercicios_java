/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe22;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor, lucro;
        System.out.println("digite o preço do produto comprado "); 
        Scanner obj = new Scanner(System.in);
         valor =obj.nextDouble();
       if (valor < 20){
           lucro = (valor * 0.45);
           System.out.println("deve vender por , " + (valor + lucro)); 
        }
        else{
           lucro = (valor * 0.3);
           System.out.println("deve vender por , " + (valor + lucro));
        }
    
}
}
    
