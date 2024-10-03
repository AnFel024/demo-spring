package com.eafit.nodo.demo.services;

import com.eafit.nodo.demo.models.NodoArbol;

public class ArbolBinarioBusquedaService {
  private NodoArbol raiz;

  public ArbolBinarioBusquedaService() {
    this.raiz = null;
  }

  // Insertar un elemento
  public void insertar(int dato) {
    raiz = insertarRec(raiz, dato);
  }

  private NodoArbol insertarRec(NodoArbol raiz, int dato) {
    if (raiz == null) {
      raiz = new NodoArbol(dato);
      return raiz;
    }
    if (dato < raiz.dato) {
      raiz.izquierdo = insertarRec(raiz.izquierdo, dato);
    } else if (dato > raiz.dato) {
      raiz.derecho = insertarRec(raiz.derecho, dato);
    }
    return raiz;
  }

  // Buscar un elemento
  public boolean buscar(int dato) {
    return buscarRec(raiz, dato) != null;
  }

  private NodoArbol buscarRec(NodoArbol raiz, int dato) {
    if (raiz == null || raiz.dato == dato) {
      return raiz;
    }
    if (dato < raiz.dato) {
      return buscarRec(raiz.izquierdo, dato);
    }
    return buscarRec(raiz.derecho, dato);
  }

  // Eliminar un elemento
  public void eliminar(int dato) {
    raiz = eliminarRec(raiz, dato);
  }

  private NodoArbol eliminarRec(NodoArbol raiz, int dato) {
    if (raiz == null) {
      return raiz;
    }
    if (dato < raiz.dato) {
      raiz.izquierdo = eliminarRec(raiz.izquierdo, dato);
    } else if (dato > raiz.dato) {
      raiz.derecho = eliminarRec(raiz.derecho, dato);
    } else {
      if (raiz.izquierdo == null) {
        return raiz.derecho;
      } else if (raiz.derecho == null) {
        return raiz.izquierdo;
      }
      raiz.dato = minValor(raiz.derecho);
      raiz.derecho = eliminarRec(raiz.derecho, raiz.dato);
    }
    return raiz;
  }

  private int minValor(NodoArbol raiz) {
    int minv = raiz.dato;
    while (raiz.izquierdo != null) {
      minv = raiz.izquierdo.dato;
      raiz = raiz.izquierdo;
    }
    return minv;
  }

  // Recorrer el árbol en orden
  public void inOrder() {
    inOrderRec(raiz);
  }

  private void inOrderRec(NodoArbol raiz) {
    if (raiz != null) {
      inOrderRec(raiz.izquierdo);
      System.out.print(raiz.dato + " ");
      inOrderRec(raiz.derecho);
    }
  }
}
