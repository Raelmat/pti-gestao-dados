package com.apiPTI.service;


import com.apiPTI.model.Secretario;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class SecretarioService {
private final List<Secretario> lista = new ArrayList<>();
private final AtomicInteger seq = new AtomicInteger(1);


public Secretario cadastrar(Secretario p) {
p.setId(seq.getAndIncrement());
lista.add(p);
return p;
}


public List<Secretario> listar() { return lista; }
}