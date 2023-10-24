/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe10;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
        int x, y;
        System.out.println("digite um numero para saber se a raiz é positiva ou negativa"); 
        Scanner obj = new Scanner(System.in);
         x =obj.nextInt();
        y = (int) Math.sqrt(x);
        if (y>0){
        System.out.println("a Raiz quadrada é positiva"); 
        }
        else{
            System.out.println("a raiz quadrada é negativa");
        }
    }
    
}
    }
    

