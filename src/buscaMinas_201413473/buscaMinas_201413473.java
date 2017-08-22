
package buscaMinas_201413473;

import java.util.Scanner;

/**
 *
 * @author Maynor
 */
public class buscaMinas_201413473 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maynor Rolando Garcia Castro \n201413473 \nIPC 'A' Practica 1 \nBuscaminas!");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                    matrix();
        
    }
        public static void matrix(){
                int dificultad;
                Scanner sc = new Scanner(System.in);
                   try{
            System.out.print("Ingrese el número segun la dificultad que deseas jugar: \n1-Principiante \n2-Intermedio \n3-Experto \n4-Salir");
            dificultad = sc.nextInt();
        }catch (Exception e){
            System.out.println("\nPorfavor ingresar números no letras");
            matrix();
            dificultad = sc.nextInt();
        }

             
    }
        
    
}
