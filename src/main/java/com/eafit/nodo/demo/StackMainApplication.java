package com.eafit.nodo.demo;

import com.eafit.nodo.demo.controller.ListaController;

public class DataMainApplication {
  public static void main(String[] args) {
    ListaController listaController = new ListaController();
    listaController.addNodo(1);
    listaController.addNodo(2);
    listaController.addNodo(3);
    listaController.addNodo(4);
    listaController.addNodo(5);
    listaController.printList();
    listaController.deleteNodo(3);
    listaController.printList();
    System.out.println("Size: " + listaController.getSize());
  }
}
