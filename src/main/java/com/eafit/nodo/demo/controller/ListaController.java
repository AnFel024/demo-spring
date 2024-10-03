package com.eafit.nodo.demo.controller;

import com.eafit.nodo.demo.services.ListaEnlazadaService;

public class ListaController {
  ListaEnlazadaService listaEnlazadaService;

  public ListaController() {
    this.listaEnlazadaService = new ListaEnlazadaService();
  }

  public void addNodo(int dato) {
    listaEnlazadaService.addNodo(dato);
  }

  public void deleteNodo(int dato) {
    listaEnlazadaService.deleteNodo(dato);
  }

  public void printList() {
    listaEnlazadaService.printList();
  }

  public int getSize() {
    return listaEnlazadaService.getSize();
  }
}
