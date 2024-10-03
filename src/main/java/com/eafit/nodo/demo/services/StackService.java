package com.eafit.nodo.demo.services;

import com.eafit.nodo.demo.models.Nodo;

public class StackService {
  Nodo cabeza;
  int size;

  public StackService() {
    this.cabeza = null;
    this.size = 0;
  }

  public void push(int dato) {
    Nodo nuevoNodo = new Nodo(dato);
    if (cabeza == null) {
      cabeza = nuevoNodo;
    } else {
      nuevoNodo.siguiente = cabeza;
      cabeza = nuevoNodo;
    }
    size++;
  }

  // Ver el elemento en la cima de la pila
  public int peek() {
    if (cabeza == null) {
      throw new RuntimeException("La pila está vacía");
    }
    return cabeza.dato;
  }

  public void pop() {
    if (cabeza != null) {
      cabeza = cabeza.siguiente;
      size--;
    }
  }

  public void printStack() {
    Nodo aux = cabeza;
    while (aux != null) {
      System.out.print(aux.dato + " -> ");
      aux = aux.siguiente;
    }
    System.out.println();
  }

  // Verificar si la pila está vacía
  public boolean isEmpty() {
    return cabeza == null;
  }

  public int getSize() {
    return size;
  }
}
