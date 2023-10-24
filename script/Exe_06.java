/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_06;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int x;
        System.out.println("digite um numero para saber se esta entre 20 e 90");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        if (x>=20 & x<=90){
            System.out.println("sim está entre 20 e 90");
        // TODO code application logic here
    }
        if (x<20){
            System.out.println("o numero é menor que 20");
}
        if (x>90){
            System.out.println("o numero é maior que 90");
        // TODO code application logic here
    }
    
}
}
