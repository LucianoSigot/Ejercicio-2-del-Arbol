/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioarbol;
import java.util.Scanner;


public class EjercicioArbol {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner leer = new Scanner(System.in);
        int opcion, valor;

        do {
            System.out.println("1. Insertar un dato");
            System.out.println("2. Recorrido en preorden");
            System.out.println("3. Recorrido en inorden");
            System.out.println("4. Recorrido en postorden");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    valor = leer.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.println("Recorrido en preorden:");
                    arbol.preOrden();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Recorrido en inorden:");
                    arbol.inOrden();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Recorrido en postorden:");
                    arbol.postOrden();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese una opcion correcta");
            }
        } while (opcion != 5);

        
    }
}