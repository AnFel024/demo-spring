package com.eafit.nodo.demo.services;

import com.eafit.nodo.demo.models.Nodo;

public class ListaEnlazadaService {
  Nodo cabeza;
  int size;

  public ListaEnlazadaService() {
    this.cabeza = null;
    this.size = 0;
  }

  public void addNodo(int dato) {
    Nodo nuevoNodo = new Nodo(dato);
    if (cabeza == null) {
      cabeza = nuevoNodo;
    } else {
      Nodo aux = cabeza;
      while (aux.siguiente != null) {
        aux = aux.siguiente;
      }
      aux.siguiente = nuevoNodo;
    }
    size++;
  }

  public void deleteNodo(int dato) {
    if (cabeza != null) {
      if (cabeza.dato == dato) {
        cabeza = cabeza.siguiente;
        size--;
      } else {
        Nodo aux = cabeza;
        while (aux.siguiente != null) {
          if (aux.siguiente.dato == dato) {
            aux.siguiente = aux.siguiente.siguiente;
            size--;
            break;
          }
          aux = aux.siguiente;
        }
      }
    }
  }

  public void printList() {
    Nodo aux = cabeza;
    while (aux != null) {
      System.out.print(aux.dato + " ");
      aux = aux.siguiente;
    }
    System.out.println();
  }

  public int getSize() {
    return size;
  }
}
