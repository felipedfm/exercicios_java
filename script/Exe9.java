/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe9;
import java.util.Scanner;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Exe9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Pair<String, Double>> func = new ArrayList<>();
        int x = 0;
        Scanner obj = new Scanner(System.in);
       while (x<4){     
System.out.println("digite o nome do funcionario"); 
        
         String nome =obj.next();
         System.out.println("digite o salario"); 
            double sal =obj.nextDouble();
func.add(new Pair<>(nome, sal));

if (func.get(x).getValue()<= 510){
    func.set(x,new Pair<>(func.get(x).getKey(), sal + sal*0.1)) ;}
else {
func.set(x,new Pair<>(func.get(x).getKey(), sal + sal*0.2)) ;}

x +=1;
    

      
}
       for (int y = 0; y < 4; y++){
       System.out.println("nome: " + func.get(y).getKey()+ " Salário: " + func.get(y).getValue());
       
}
}
}