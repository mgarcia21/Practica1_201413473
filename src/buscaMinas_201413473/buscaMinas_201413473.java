
package buscaMinas_201413473;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;

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
                int cantidad = 0;
                Scanner sc = new Scanner(System.in);
                   try{
            System.out.print("Ingrese el número segun la dificultad que deseas jugar: \n1-Principiante \n2-Intermedio \n3-Experto \n4-Salir");
            dificultad = sc.nextInt();
        }catch (Exception e){
            System.out.println("\nPorfavor ingresar números no letras");
            matrix();
            dificultad = sc.nextInt();
        }

                   switch (dificultad){
                       case 1:
                           cantidad = 4;
                           String matriz[][] = new String[4][4];
                           int mfantasma[][] = new int[4][4];
                           int[] xx = new int[14];
                           int[] yy = new int[14];
                           int bomba [] ={1,1,1,1, 2,2,2,2, 3,3,3,3, 4,4,4,4 };
                           for (int i = 0; i < cantidad; i++){
                           int x = (int)(Math.random()*4+0);
                           int y = (int)(Math.random()*4+0);
                           if ( mfantasma[x][y]==0){
                           mfantasma[x][y] = bomba[i];
                           }else{
                                   i--;
                           }
                        }                           
                   
                            for (int j = 0; j < 4; j++) {
                            for (int i = 0; i < 4; i++) {
                            }
                                System.out.print("\n");
                             }
                                System.out.println("");
                                for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matriz[i][j] = "*";
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }            
                     Scanner sca = new Scanner(System.in);
                     String opcion;
                   try{
                    System.out.print("Voltear: v \nReiniciar:r \nSalir:s \nIngresar Opcion en minuscula:");           
                    opcion = sca.next();
        }catch (Exception e){
            System.out.println("\nPorfavor ingresar números no letras");
            matrix();
            opcion = sca.next();
        }
                   if(opcion.equals("v")){
                       boolean vida = true;        
                       while (vida) {
            int Cy, Cx;
            System.out.println("\n");
            System.out.println("Ingresa las coordenadas ->[fila (Y), columna (X)]<-");
            
            try{
                System.out.print("Ingrese Y: ");
                Cy = sc.nextInt();
                System.out.print("Ingrese x: ");
                Cx = sc.nextInt();
            }catch (Exception e){
                System.out.println("\n Ingresar solamente numeros");
                System.out.println(" (X) no debe exceder de 4 y (Y) no debe exceder de 4");
                Cy=sc.nextInt();
                Cx=sc.nextInt();
                System.exit(0);
            }
                        
            switch(mfantasma[Cx-1][Cy-1]){
                case 0:
                    System.out.println("\n  vas bien"); 
                     for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < 4; i++) {
                            matriz[Cx - 1][Cy - 1] = "o";
                            System.out.print(matriz[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 1:
                    vida=false;
                    System.out.println("\n  Perdiste ");
                     System.exit(0);
               
                    break;
                case 2:
                    vida=false;
                    System.out.println("\n Perdiste");
                                     System.exit(0);
                    break;
                case 3:
                    vida=true;
                    for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < 4; i++) {
                            matriz[Cx - 1][Cy - 1] = "o";
                            System.out.print(matriz[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                  
                    for (int j = 0; j < 4; j++) {
                        for (int i = 0; i < 4; i++) {
                            matriz[Cx - 1][Cy - 1] = "o";
                            System.out.print(matriz[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
            }
           }
                    }else if(opcion.equals("r" )){     
                               matrix();
                    }else if(opcion.equals("s")){
                                                       System.out.println("\n Gracias por habe jugado!");

                    }else{
                               System.out.println("\n porfavor selecciona una de las opciones anteriores");
                                           matrix();
                                          }
                break;
                
                case 2:
                cantidad = 6;
                String matrizb[][] = new String[6][6];
                           int mfantasmab[][] = new int[6][6];
                           int[] xxb = new int[6];
                           int[] yyb = new int[6];
                int bomba2[] = {1,1,1,1,1, 2,2,2,2,2, 3,3,3,3,3, 4,4,4,4,4};
                for (int i = 0; i < cantidad; i++) {
                       int x =(int)(Math.random()*6+0);
                       int y = (int)(Math.random()*6+0);
                    if (mfantasmab[x][y]==0){
                    mfantasmab[x][y] = bomba2[i];
                    }else{
                    i--;
                    }
                }
                for (int j = 0; j < 6; j++) {
                    for (int i = 0; i < 6; i++) {
                        System.out.print(matrizb[i][j]);
                    }
                    System.out.print("\n");
                }
                System.out.println("");
                for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                matrizb[i][j] = "*";
                System.out.print(matrizb[i][j]);
            }

            System.out.print("\n");
        } Scanner scb = new Scanner(System.in);
                     String opcionb;
                   try{
                    System.out.print("Voltear: v \nReiniciar:r \nSalir:s \nIngresar Opcion en minuscula:");           
                    opcion = scb.next();
        }catch (Exception e){
            System.out.println("\nPorfavor ingresar números no letras");
            matrix();
            opcion = scb.next();
        }
                   if(opcion.equals("v")){
                       boolean vida = true;        
                       while (vida) {
            int Cy, Cx;
            System.out.println("\n");
            System.out.println("Ingresa las coordenadas ->[fila (Y), columna (X)]<-");
            
            try{
                System.out.print("Ingrese Y: ");
                Cy = sc.nextInt();
                System.out.print("Ingrese x: ");
                Cx = sc.nextInt();
            }catch (Exception e){
                System.out.println("\n Ingresar solamente numeros");
                System.out.println(" (X) no debe exceder de 4 y (Y) no debe exceder de 4");
                Cy=sc.nextInt();
                Cx=sc.nextInt();
                System.exit(0);
            }
                        
            switch(mfantasmab[Cx-1][Cy-1]){
                case 0:
                    System.out.println("\n  vas bien"); 
                     for (int j = 0; j < 6; j++) {
                        for (int i = 0; i < 6; i++) {
                            matrizb[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizb[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 1:
                    vida=false;
                    System.out.println("\n  Perdiste ");
                     System.exit(0);
               
                    break;
                case 2:
                    vida=false;
                    System.out.println("\n Perdiste");
                                     System.exit(0);
                    break;
                case 3:
                    vida=true;
                    for (int j = 0; j < 6; j++) {
                        for (int i = 0; i < 6; i++) {
                            matrizb[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizb[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                  
                    for (int j = 0; j < 6; j++) {
                        for (int i = 0; i < 6; i++) {
                            matrizb[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizb[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
            }
           }
                    }else if(opcion.equals("r" )){     
                               matrix();
                    }else if(opcion.equals("s")){
                                                       System.out.println("\n Gracias por habe jugado!");

                    }else{
                               System.out.println("\n porfavor selecciona una de las opciones anteriores");
                                           matrix();
                                          }
                break;
                case 3:
                cantidad = 8;
                String matrizc[][] = new String[8][8];
                           int mfantasmac[][] = new int[8][8];
                           int[] xxc = new int[14];
                           int[] yyc = new int[14];
                int bomba3[] = {1,1,1,1,1, 2,2,2,2,2, 3,3,3,3,3, 4,4,4,4,4};
                for (int i = 0; i < cantidad; i++) {
                       int x =(int)(Math.random()*8+0);
                       int y = (int)(Math.random()*8+0);
                    if (mfantasmac[x][y]==0){
                    mfantasmac[x][y] = bomba3[i];
                    }else{
                    i--;
                    }
                }
                for (int j = 0; j < 8; j++) {
                    for (int i = 0; i < 8; i++) {
                        System.out.print(matrizc[i][j]);
                    }
                    System.out.print("\n");
                }
                System.out.println("");
                for (int j = 0; j < 8; j++) {
                for (int i = 0; i < 8; i++) {
                matrizc[i][j] = "*";
                System.out.print(matrizc[i][j]);
            }

            System.out.print("\n");
        } Scanner scc = new Scanner(System.in);
                     String opcionc;
                   try{
                    System.out.print("Voltear: v \nReiniciar:r \nSalir:s \nIngresar Opcion en minuscula:");           
                    opcion = scc.next();
        }catch (Exception e){
            System.out.println("\nPorfavor ingresar números no letras");
            matrix();
            opcion = scc.next();
        }
                   if(opcion.equals("v")){
                       boolean vida = true;        
                       while (vida) {
            int Cy, Cx;
            System.out.println("\n");
            System.out.println("Ingresa las coordenadas ->[fila (Y), columna (X)]<-");
            
            try{
                System.out.print("Ingrese Y: ");
                Cy = sc.nextInt();
                System.out.print("Ingrese x: ");
                Cx = sc.nextInt();
            }catch (Exception e){
                System.out.println("\n Ingresar solamente numeros");
                System.out.println(" (X) no debe exceder de 4 y (Y) no debe exceder de 4");
                Cy=sc.nextInt();
                Cx=sc.nextInt();
                System.exit(0);
            }
                        
            switch(mfantasmac[Cx-1][Cy-1]){
                case 0:
                    System.out.println("\n  vas bien"); 
                     for (int j = 0; j < 8; j++) {
                        for (int i = 0; i < 8; i++) {
                            matrizc[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizc[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 1:
                    vida=false;
                    System.out.println("\n  Perdiste ");
                     System.exit(0);
               
                    break;
                case 2:
                    vida=false;
                    System.out.println("\n Perdiste");
                                     System.exit(0);
                    break;
                case 3:
                    vida=true;
                    for (int j = 0; j < 8; j++) {
                        for (int i = 0; i < 8; i++) {
                            matrizc[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizc[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                  
                    for (int j = 0; j < 8; j++) {
                        for (int i = 0; i < 8; i++) {
                            matrizc[Cx - 1][Cy - 1] = "o";
                            System.out.print(matrizc[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
            }
           }
                    }else if(opcion.equals("r" )){     
                               matrix();
                    }else if(opcion.equals("s")){
                                                       System.out.println("\n Gracias por habe jugado!");

                    }else{
                               System.out.println("\n porfavor selecciona una de las opciones anteriores");
                                           matrix();
                                          }
                break;
                }
                   
                   
        }
    
}
