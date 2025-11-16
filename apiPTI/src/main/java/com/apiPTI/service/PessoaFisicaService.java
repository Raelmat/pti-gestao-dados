package com.apiPTI.service;


import com.apiPTI.model.PessoaFisica;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class PessoaFisicaService {
private final List<PessoaFisica> lista = new ArrayList<>();
private final AtomicInteger seq = new AtomicInteger(1);


public PessoaFisica cadastrar(PessoaFisica p) {
p.setId(seq.getAndIncrement());
lista.add(p);
return p;
}


public List<PessoaFisica> listar() {
return lista;
}
}