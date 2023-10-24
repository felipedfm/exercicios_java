/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe23;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
        int idade;
        System.out.println("digite sua idade"); 
        Scanner obj = new Scanner(System.in);
         idade =obj.nextInt();
       if (idade < 18){
          System.out.println("Você é menor de idade" ); 
        } 
       else if (idade > 64){
        System.out.println( " 65 anos ou mais " );
    }
        else{
           System.out.println("Maior de Idade");
        }
    
}
}
    }
 