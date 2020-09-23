/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn6ej1;

/**
 *
 * @author yo125
 * 
 */

public class Matriz {
        
    int [][] matriz  = new int [4][];
    
      int aux=1;
      
    
    

    public Matriz() {
    }
    

    public void Matriz() {
        
         for (int i=0; i<matriz.length; i++){
             
            for (int j=0; j<matriz[i].length; j++){
                
                matriz[i][j]=3*aux;
                aux++;
               System.out.print("  " + matriz[i][j]);
               
                  
            }
           System.out.println();
           
        }
    System.out.println();
    }
    
    
    public void Matriz1() {
        int f=1;
         for (int i=0; i<matriz.length; i++){
             System.out.print("Fila " + f);
             f++;
            for (int j=0; j<matriz[i].length; j++){
                
                if (matriz[i][j]%2==0){
               System.out.print("  " + matriz[i][j]);
               }
                  
            }
           System.out.println(); 
        }
    
    }  
    
}
