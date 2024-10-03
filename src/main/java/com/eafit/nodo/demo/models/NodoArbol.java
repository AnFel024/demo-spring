package com.eafit.nodo.demo.models;

public class NodoArbol {
  public int dato;
  public NodoArbol izquierdo;
  public NodoArbol derecho;

  public NodoArbol(int dato) {
    this.dato = dato;
    this.izquierdo = null;
    this.derecho = null;
  }
}
