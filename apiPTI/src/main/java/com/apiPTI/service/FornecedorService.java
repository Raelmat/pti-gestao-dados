package com.apiPTI.service;


import com.apiPTI.model.Fornecedor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class FornecedorService {
private final List<Fornecedor> lista = new ArrayList<>();
private final AtomicInteger seq = new AtomicInteger(1);


public Fornecedor cadastrar(Fornecedor p) {
p.setId(seq.getAndIncrement());
lista.add(p);
return p;
}


public List<Fornecedor> listar() { return lista; }
}