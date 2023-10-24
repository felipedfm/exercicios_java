/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe13;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        System.out.println("digite o dividendo "); 
        Scanner obj = new Scanner(System.in);
         x =obj.nextInt();
        System.out.println("digite o divisor ");
        y = obj.nextInt();
        if (x%y==0){
        System.out.println("O primeiro numero é divisivel pelo segundo"); 
        }
        else{
            System.out.println("O primeiro numero não é divisivel pelo segundo");
        }
    }
    
}
