package com.eafit.nodo.demo.services;

public class NodoArbol {
  int dato;
  NodoArbol izquierdo;
  NodoArbol derecho;

  public NodoArbol(int dato) {
    this.dato = dato;
    this.izquierdo = null;
    this.derecho = null;
  }
}
