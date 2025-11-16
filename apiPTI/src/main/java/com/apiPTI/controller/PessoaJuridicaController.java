package com.apiPTI.controller;


import com.apiPTI.model.PessoaJuridica;
import com.apiPTI.service.PessoaJuridicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/pessoa-juridica")
public class PessoaJuridicaController {


private final PessoaJuridicaService service;


public PessoaJuridicaController(PessoaJuridicaService service) {
this.service = service;
}


@PostMapping
public ResponseEntity<PessoaJuridica> cadastrar(@RequestBody PessoaJuridica p) {
PessoaJuridica criado = service.cadastrar(p);
return ResponseEntity.ok(criado);
}


@GetMapping
public ResponseEntity<List<PessoaJuridica>> listar() {
return ResponseEntity.ok(service.listar());
}
}