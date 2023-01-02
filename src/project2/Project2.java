
package project2;

import java.util.Scanner;


public class Project2 {

   
    public static void main(String[] args) {
        var dato = new Scanner(System.in);
        
        
        int mes;//mes del año
        String estacion;
        System.out.println("dame el mes");
        mes=dato.nextInt();
        
        
        
       
        
        if( mes == 12 || mes == 1 || mes == 2 || mes == 3){
           System.out.println("Invierno");
        }
        else if( mes == 4 || mes == 5 || mes == 6){
           System.out.println("Primavera");
        }
         else if( mes == 7 || mes == 8 || mes == 9){
           System.out.println("Verano");
        }
         else if( mes == 9 || mes == 10 || mes == 11){
           System.out.println("Otono");
        }
         else{
           System.out.println("Mes no existe");
         }
            
            
     
    }
    
}
