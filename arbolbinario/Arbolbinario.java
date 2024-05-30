/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;

import java.util.Scanner;

public class Arbolbinario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int opcion, valor;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Buscar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Recorrido inOrden");
            System.out.println("5. Recorrido preOrden");
            System.out.println("6. Recorrido postOrden");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    valor = leer.nextInt();
                    arbol.insertar(valor);
                    System.out.println("Nodo insertado.");
                    break;
                case 2:
                    System.out.print("Ingrese el valor a buscar: ");
                    valor = leer.nextInt();
                    Nodo nodo = arbol.buscar(valor);
                    if (nodo != null) {
                        System.out.println("Nodo encontrado: " + nodo.dato);
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el valor a eliminar: ");
                    valor = leer.nextInt();
                    arbol.eliminar(valor);
                    System.out.println("Nodo eliminado.");
                    break;
                case 4:
                    System.out.println("Recorrido inOrden:");
                    arbol.inOrden();
                    break;
                case 5:
                    System.out.println("Recorrido preOrden:");
                    arbol.preOrden();
                    break;
                case 6:
                    System.out.println("Recorrido postOrden:");
                    arbol.postOrden();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        
    }
}