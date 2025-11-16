package com.apiPTI.service;


import com.apiPTI.model.PessoaJuridica;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class PessoaJuridicaService {
private final List<PessoaJuridica> lista = new ArrayList<>();
private final AtomicInteger seq = new AtomicInteger(1);


public PessoaJuridica cadastrar(PessoaJuridica p) {
p.setId(seq.getAndIncrement());
lista.add(p);
return p;
}


public List<PessoaJuridica> listar() { return lista; }
}