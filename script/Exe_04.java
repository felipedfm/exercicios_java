/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_04;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        System.out.println("digite um numero para saber se é divisivel por 3 e por 5");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        if (x%3==0 & x%5==0 & x!=0){
            System.out.println(x + " é divisivel por 3 e 5");
        // TODO code application logic here
    }
        else{
            System.out.println(x + " não é divisivel por 3 e 5");

    
}
    }
}