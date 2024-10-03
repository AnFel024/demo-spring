package com.eafit.nodo.demo;

import com.eafit.nodo.demo.services.StackService;
import java.util.Stack;

public class StackMainApplication {
  public static void main(String[] args) {
    StackService pila = new StackService();

    pila.push(1);
    pila.push(2);
    pila.push(3);
    pila.push(4);
    System.out.println("Cima: " + pila.peek()); // Salida: Cima: 3
    System.out.println("Tamaño: " + pila.getSize()); // Salida: Tamaño: 3
    pila.pop(); // Salida: Desapilado: 3
    pila.printStack();
    System.out.println("Cima: " + pila.peek()); // Salida: Cima: 2
    System.out.println("Tamaño: " + pila.getSize()); // Salida: Tamaño: 2

    System.out.println("La pila está vacía: " + pila.isEmpty());
  }
}
