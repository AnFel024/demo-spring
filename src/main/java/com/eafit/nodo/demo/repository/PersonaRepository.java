package com.eafit.nodo.demo.repository;

import com.eafit.nodo.demo.models.Persona;
import java.util.List;

public class PersonaRepository {

  private List<Persona> personas;

  public PersonaRepository(List<Persona> personas) {
    this.personas = personas;
  }

  public List<Persona> getPersonas() {
    return personas;
  }

  public void addPersona(Persona persona) {
    personas.add(persona);
  }

  public void deletePersona(Persona persona) {
    personas.remove(persona);
  }
}
