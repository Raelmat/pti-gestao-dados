package com.apiPTI.controller;


import com.apiPTI.model.Fornecedor;
import com.apiPTI.service.FornecedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {


private final FornecedorService service;


public FornecedorController(FornecedorService service) {
this.service = service;
}


@PostMapping
public ResponseEntity<Fornecedor> cadastrar(@RequestBody Fornecedor p) {
Fornecedor criado = service.cadastrar(p);
return ResponseEntity.ok(criado);
}


@GetMapping
public ResponseEntity<List<Fornecedor>> listar() {
return ResponseEntity.ok(service.listar());
}
}