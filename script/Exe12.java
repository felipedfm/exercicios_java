/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe12;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String perg;
       System.out.println("Qual a capital do Brasil?? ");
       Scanner obj = new Scanner(System.in);
         perg=obj.nextLine();
      if (perg.equals("Brasilia")){
          System.out.println("certa resposta");
      }
      else {
          System.out.println("errou");
     
      }
              
    }
}
    

