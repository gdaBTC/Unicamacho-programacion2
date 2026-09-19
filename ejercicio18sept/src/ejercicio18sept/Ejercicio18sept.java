/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18sept;

import java.util.Scanner;

/**
 *
 * @author Global
 */
public class Ejercicio18sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Ejercicios de bucles y while clase");

                Scanner scan = new Scanner(System.in);

                System.out.println("Adivina mi color favorito: ");
                String bandera = scan.nextLine();

                while(!bandera.equals("azul")){

                    System.out.println("Ese no es... vuelve a intentarlo");
                    System.out.println("Adivina mi color favorito:");
                    bandera = scan.nextLine();
                }
                System.out.println("Muy bien...");

            }
        }
    
    

