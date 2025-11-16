package com.apiPTI.model;


public class Professor extends Funcionario {
private String formacao;
private String disciplina;


public Professor() { super(); }


public Professor(Integer id, String nome, String endereco, String telefone, String email,
String cpf, String rg, String dataNasc, String sexo, String matricula,
String registroPro, String formacao, String disciplina) {
super(id, nome, endereco, telefone, email, cpf, rg, dataNasc, sexo, matricula, registroPro);
this.formacao = formacao;
this.disciplina = disciplina;
}


public String getFormacao() { return formacao; }
public void setFormacao(String formacao) { this.formacao = formacao; }


public String getDisciplina() { return disciplina; }
public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
}
