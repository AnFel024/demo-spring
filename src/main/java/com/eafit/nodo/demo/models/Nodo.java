package com.eafit.nodo.demo.models;

public class Nodo {
  public int dato;
  public Nodo siguiente;

  public Nodo(int dato) {
    this.dato = dato;
    this.siguiente = null;
  }
}
