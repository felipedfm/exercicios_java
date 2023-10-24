/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe15;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe15 {

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
        if (x > y){
        System.out.println(x + " é o maior numero"); 
        }
        else if (x==y){
        System.out.println(" são iguais");
        }
        else{
            System.out.println(y + " é o maior numero");
        }
    }
    }
    

