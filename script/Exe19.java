/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe19;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x, y, z, maior = 0;
        System.out.println("digite o primeiro numero "); 
        Scanner obj = new Scanner(System.in);
         x =obj.nextInt();
        System.out.println("digite o segundo numero ");
        y = obj.nextInt();
         System.out.println("digite o terceiro numero ");
        z = obj.nextInt();
        
    if(x > y){
        if(x > z)
            maior = x;
        else
            maior = z;
    }
    else{
        if(y > z)
            maior = y;
        else
            maior = z;
    }
System.out.println("o maior numero é " + maior);
    
}

}
    

