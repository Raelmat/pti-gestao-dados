package com.apiPTI.model;


public class PessoaFisica extends Pessoa {
private String cpf;
private String rg;
private String dataNasc;
private String sexo;
private String matricula;


public PessoaFisica() { super(); }


public PessoaFisica(Integer id, String nome, String endereco, String telefone, String email,
String cpf, String rg, String dataNasc, String sexo, String matricula) {
super(id, nome, endereco, telefone, email);
this.cpf = cpf;
this.rg = rg;
this.dataNasc = dataNasc;
this.sexo = sexo;
this.matricula = matricula;
}


public String getCpf() { return cpf; }
public void setCpf(String cpf) { this.cpf = cpf; }


public String getRg() { return rg; }
public void setRg(String rg) { this.rg = rg; }


public String getDataNasc() { return dataNasc; }
public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }


public String getSexo() { return sexo; }
public void setSexo(String sexo) { this.sexo = sexo; }


public String getMatricula() { return matricula; }
public void setMatricula(String matricula) { this.matricula = matricula; }
}