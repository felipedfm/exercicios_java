/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe18;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        System.out.println("digite o Primeiro numero "); 
        Scanner obj = new Scanner(System.in);
         x =obj.nextInt();
        System.out.println("digite o segundo numero ");
        y = obj.nextInt();
        if (x < y){
        System.out.println(y + " , " +x); 
        }
        else if (x > y){
        System.out.println(x + " , " + y);
    }
    else{
            System.out.println(" são iguais");
        }
}
}