/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;


class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    // Busqueda de un nodo
    public Nodo buscar(int dato) {
        return buscarRecursivo(this.raiz, dato);
    }

    private Nodo buscarRecursivo(Nodo raiz, int dato) {
        if (raiz == null || raiz.dato == dato)
            return raiz;
        if (dato < raiz.dato)
            return buscarRecursivo(raiz.izquierdo, dato);
        return buscarRecursivo(raiz.derecho, dato);
    }

    // Insercion de un nodo
    public void insertar(int dato) {
        this.raiz = insertarRecursivo(this.raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }
        if (dato < raiz.dato)
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, dato);
        else if (dato > raiz.dato)
            raiz.derecho = insertarRecursivo(raiz.derecho, dato);
        return raiz;
    }

    // Metodo público para eliminar un nodo
    public void eliminar(int dato) {
        this.raiz = eliminarRecursivo(this.raiz, dato);
    }

    // Metodo privado para eliminar un nodo, sobrecargado
    private Nodo eliminarRecursivo(Nodo raiz, int dato) {
        if (raiz == null) {
            return raiz;
        }

        // Buscar el nodo a eliminar
        if (dato < raiz.dato) {
            raiz.izquierdo = eliminarRecursivo(raiz.izquierdo, dato);
        } else if (dato > raiz.dato) {
            raiz.derecho = eliminarRecursivo(raiz.derecho, dato);
        } else {
            // Nodo encontrado

            // Caso 1: nodo con solo un hijo o sin hijos
            if (raiz.izquierdo == null) {
                return raiz.derecho;
            } else if (raiz.derecho == null) {
                return raiz.izquierdo;
            }

            // Caso 2: nodo con dos hijos
            // Obtener el predecesor inorden (mayor de los menores)
            raiz.dato = valorMaximo(raiz.izquierdo);

            // Eliminar el predecesor inorden
            raiz.izquierdo = eliminarRecursivo(raiz.izquierdo, raiz.dato);
        }

        return raiz;
    }

    private int valorMaximo(Nodo raiz) {
        int maxv = raiz.dato;
        while (raiz.derecho != null) {
            maxv = raiz.derecho.dato;
            raiz = raiz.derecho;
        }
        return maxv;
    }

    // Recorridos del árbol
    public void inOrden() {
        inOrdenRecursivo(this.raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(Nodo raiz) {
        if (raiz != null) {
            inOrdenRecursivo(raiz.izquierdo);
            System.out.print(raiz.dato + " ");
            inOrdenRecursivo(raiz.derecho);
        }
    }

    public void preOrden() {
        preOrdenRecursivo(this.raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preOrdenRecursivo(raiz.izquierdo);
            preOrdenRecursivo(raiz.derecho);
        }
    }

    public void postOrden() {
        postOrdenRecursivo(this.raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(Nodo raiz) {
        if (raiz != null) {
            postOrdenRecursivo(raiz.izquierdo);
            postOrdenRecursivo(raiz.derecho);
            System.out.print(raiz.dato + " ");
        }
    }
}