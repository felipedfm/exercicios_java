/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe14;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        System.out.println("digite um numero "); 
        Scanner obj = new Scanner(System.in);
         x =obj.nextInt();
        System.out.println("digite outro numero ");
        y = obj.nextInt();
        if (x == y){
        System.out.println("São iguais"); 
        }
        else{
            System.out.println("são diferentes");
        }
    }
    }
    

