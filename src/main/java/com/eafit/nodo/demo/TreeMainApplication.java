package com.eafit.nodo.demo;

import com.eafit.nodo.demo.services.ArbolBinarioBusquedaService;

public class TreeMainApplication {
  public static void main(String[] args) {
    ArbolBinarioBusquedaService arbol = new ArbolBinarioBusquedaService();
    arbol.insertar(50);
    arbol.insertar(30);
    arbol.insertar(20);
    arbol.insertar(40);
    arbol.insertar(70);
    arbol.insertar(60);
    arbol.insertar(80);

    System.out.println("Recorrido en orden:");
    arbol.inOrder(); // Salida: 20 30 40 50 60 70 80

    System.out.println("\nBuscar 40: " + arbol.buscar(40)); // Salida: true
    System.out.println("Buscar 90: " + arbol.buscar(90)); // Salida: false

    arbol.eliminar(20);
    System.out.println("\nRecorrido en orden después de eliminar 20:");
    arbol.inOrder(); // Salida: 30 40 50 60 70 80

    arbol.eliminar(30);
    System.out.println("\nRecorrido en orden después de eliminar 30:");
    arbol.inOrder(); // Salida: 40 50 60 70 80

    arbol.eliminar(50);
    System.out.println("\nRecorrido en orden después de eliminar 50:");
    arbol.inOrder(); // Salida: 40 60 70 80
  }
}
