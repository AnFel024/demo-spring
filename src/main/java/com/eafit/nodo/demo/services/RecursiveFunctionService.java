package com.eafit.nodo.demo.services;

public class RecursiveFunctionService {
  boolean terminar;

  public RecursiveFunctionService() {
    this.terminar = false;
  }

  public void recursiveFunction(int n) {
    if (n > 0 && !terminar) {
      System.out.println(n);
      recursiveFunction(n - 1);
    } else {
      terminar = true;
    }
  }

  public int recursiveFunctionSum(int n) {
    if (n == 0) {
      System.out.println("El numero va en " + n);
      return 0;
    } else {
      System.out.println("El numero va en " + n);
      return n + recursiveFunctionSum(n - 1);
    }
  }
}
