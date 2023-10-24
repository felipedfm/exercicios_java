/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_02;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        System.out.println("digite um numero para saber se é par ou impar");
        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        if (x%2==0){
            System.out.println("o numero é par");
        // TODO code application logic here
    }
        else{
            System.out.println("o numero é impar");
}
    }
}
