/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nome;
        float x1, x2, x3;
         System.out.println("digite o nome ");
         
        Scanner obj = new Scanner(System.in);
         nome=obj.nextLine();
        
        System.out.println("primeira media ");
        x1=obj.nextInt();
        System.out.println("digite a segunda media ");
        x2=obj.nextInt();
        x3 = (x1+x2)/2;
        
        if (x3>7){
            System.out.println(nome + "  Você foi aprovado");
        
    }
        if (x3<3){
            System.out.println(nome + " você foi reprovado");
}
        else{
            System.out.println("sua media é " + x3 + " prova final");
    }
    
}
}
