package com.apiPTI.model;


public class Secretario extends Funcionario {
public Secretario() { super(); }


public Secretario(Integer id, String nome, String endereco, String telefone, String email,
String cpf, String rg, String dataNasc, String sexo, String matricula,
String registroPro) {
super(id, nome, endereco, telefone, email, cpf, rg, dataNasc, sexo, matricula, registroPro);
}
}