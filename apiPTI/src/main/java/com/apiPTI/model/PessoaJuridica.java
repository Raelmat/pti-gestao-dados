package com.apiPTI.model;


public class PessoaJuridica extends Pessoa {
private String cnpj;
private String inscrEstadual;
private String nomeFantasia;
private String representanteLegal;


public PessoaJuridica() { super(); }


public PessoaJuridica(Integer id, String nome, String endereco, String telefone, String email,
String cnpj, String inscrEstadual, String nomeFantasia, String representanteLegal) {
super(id, nome, endereco, telefone, email);
this.cnpj = cnpj;
this.inscrEstadual = inscrEstadual;
this.nomeFantasia = nomeFantasia;
this.representanteLegal = representanteLegal;
}


public String getCnpj() { return cnpj; }
public void setCnpj(String cnpj) { this.cnpj = cnpj; }


public String getInscrEstadual() { return inscrEstadual; }
public void setInscrEstadual(String inscrEstadual) { this.inscrEstadual = inscrEstadual; }


public String getNomeFantasia() { return nomeFantasia; }
public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }


public String getRepresentanteLegal() { return representanteLegal; }
public void setRepresentanteLegal(String representanteLegal) { this.representanteLegal = representanteLegal; }
}