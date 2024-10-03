package com.eafit.nodo.demo;

import com.eafit.nodo.demo.controller.PersonaController;
import com.eafit.nodo.demo.models.Persona;
import com.eafit.nodo.demo.repository.PersonaRepository;
import com.eafit.nodo.demo.services.RecursiveFunctionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

public class DemoApplication {
  public static void main(String[] args) {
    List<Integer> lista;

    RecursiveFunctionService recursiveFunctionService = new RecursiveFunctionService();
    int i = recursiveFunctionService.recursiveFunctionSum(10);
    System.out.println("La suma de los numeros es: " + i);
  }
}
