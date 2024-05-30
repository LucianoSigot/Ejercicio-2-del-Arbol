/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author lucia
 */
class Nodo {
    int dato;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        this.dato = item;
        this.izquierdo = this.derecho = null;
    }
}