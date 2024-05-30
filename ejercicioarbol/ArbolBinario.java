/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarbol;
class ArbolBinario {
    Nodo raiz;

    // Constructor
    public ArbolBinario() {
        this.raiz = null;
    }

    // Metodo para insertar un nuevo nodo con un valor dado
    void insertar(int dato) {
        this.raiz = insertarRec(this.raiz, dato);
    }

    // Metodo recursivo para insertar un nuevo nodo
    Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {//Veo si existe una raiz
            raiz = new Nodo(dato);//Si no existe creo una raiz de tipo nodo
            return raiz;//Retorno la raiz
        }

        if (dato < raiz.dato)//Si existe una raiz y el dato es menor que el dato de la raiz, se ingresa a la izquierda en la siguiente linea
            raiz.izquierdo = insertarRec(raiz.izquierdo, dato);
        else if (dato > raiz.dato)//Si el dato es mayor que el dato de la raiz se inserta a la derecha de la raiz
            raiz.derecho = insertarRec(raiz.derecho, dato);

        return raiz; //Retorno la raiz
    }

    // Recorrido en preorden
    void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    // Recorrido en inorden
    void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inOrden(nodo.derecho);
        }
    }

    // Recorrido en postorden
    void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    // Metodos de acceso público para los recorridos
    void preOrden() { preOrden(this.raiz); }
    void inOrden() { inOrden(this.raiz); }
    void postOrden() { postOrden(this.raiz); }
}
