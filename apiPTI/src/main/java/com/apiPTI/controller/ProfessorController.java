package com.apiPTI.controller;


import com.apiPTI.model.Professor;
import com.apiPTI.service.ProfessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/professor")
public class ProfessorController {


private final ProfessorService service;


public ProfessorController(ProfessorService service) {
this.service = service;
}


@PostMapping
public ResponseEntity<Professor> cadastrar(@RequestBody Professor p) {
Professor criado = service.cadastrar(p);
return ResponseEntity.ok(criado);
}


@GetMapping
public ResponseEntity<List<Professor>> listar() {
return ResponseEntity.ok(service.listar());
}
}