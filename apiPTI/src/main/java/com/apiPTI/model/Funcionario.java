package com.apiPTI.model;


public class Funcionario extends PessoaFisica {
private String registroPro;


public Funcionario() { super(); }


public Funcionario(Integer id, String nome, String endereco, String telefone, String email,
String cpf, String rg, String dataNasc, String sexo, String matricula,
String registroPro) {
super(id, nome, endereco, telefone, email, cpf, rg, dataNasc, sexo, matricula);
this.registroPro = registroPro;
}


public String getRegistroPro() { return registroPro; }
public void setRegistroPro(String registroPro) { this.registroPro = registroPro; }
}