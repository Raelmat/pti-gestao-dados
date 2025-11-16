package com.apiPTI.controller;


import com.apiPTI.model.Secretario;
import com.apiPTI.service.SecretarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/secretario")
public class SecretarioController {


private final SecretarioService service;


public SecretarioController(SecretarioService service) {
this.service = service;
}


@PostMapping
public ResponseEntity<Secretario> cadastrar(@RequestBody Secretario p) {
Secretario criado = service.cadastrar(p);
return ResponseEntity.ok(criado);
}


@GetMapping
public ResponseEntity<List<Secretario>> listar() {
return ResponseEntity.ok(service.listar());
}
}