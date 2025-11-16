package com.apiPTI.service;


import com.apiPTI.model.Professor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class ProfessorService {
private final List<Professor> lista = new ArrayList<>();
private final AtomicInteger seq = new AtomicInteger(1);


public Professor cadastrar(Professor p) {
p.setId(seq.getAndIncrement());
lista.add(p);
return p;
}


public List<Professor> listar() { return lista; }
}