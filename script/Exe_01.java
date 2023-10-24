/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_01;

import java.util.Scanner;

/**
 *
 * @author Cane
 */
public class Exe_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,s;
        String nome;
        System.out.println("digite o primeiro valor");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        System.out.println("digite o segundo valor");
        y=obj.nextInt();
        s= x+y;
        System.out.println("digite seu nome");
        nome = obj.next();
        if (s>10){
            System.out.println(nome +" a soma dos numeros é = " + s);
            
        }
        
        // TODO code application logic here
    }
    
}
