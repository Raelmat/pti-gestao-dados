package com.apiPTI.controller;


import com.apiPTI.model.PessoaFisica;
import com.apiPTI.service.PessoaFisicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/pessoa-fisica")
public class PessoaFisicaController {


private final PessoaFisicaService service;


public PessoaFisicaController(PessoaFisicaService service) {
this.service = service;
}


@PostMapping
public ResponseEntity<PessoaFisica> cadastrar(@RequestBody PessoaFisica p) {
PessoaFisica criado = service.cadastrar(p);
return ResponseEntity.ok(criado);
}


@GetMapping
public ResponseEntity<List<PessoaFisica>> listar() {
return ResponseEntity.ok(service.listar());
}
}