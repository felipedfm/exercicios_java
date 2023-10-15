/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_05;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int x;
        System.out.println("digite um numero para saber se é divisivel por 3 e por 5");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        if (x%10==0 || x%5==0 && x!=0){
            if(x%2==0 && x%5==0 ){
            System.out.println(x + " é divisivel por 10 , 5 e 2 ");
        // TODO code application logic here
    }
            if(x%2 == 0 && x%5 !=0 ){
            System.out.println(" é divisivel por 10 e 2 ");
            }
        if (x%10 != 0 && x%5 !=0 && x%2!=0){
            System.out.println(x + " não é divisivel por 10 , 5 ou 2");

    
}
    
}
}
}