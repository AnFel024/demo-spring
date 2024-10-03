package com.eafit.nodo.demo.controller;

import com.eafit.nodo.demo.models.Persona;
import com.eafit.nodo.demo.repository.PersonaRepository;
import java.util.List;

public class PersonaController {

    private PersonaRepository personaRepository;

    public PersonaController(PersonaRepository personaRepository) {
      this.personaRepository = personaRepository;
    }

    public String addPersona(Persona persona) {
      personaRepository.addPersona(persona);
      return "Persona agregada " + persona.toString();
    }
}
