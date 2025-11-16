package com.apiPTI.model;


public class Fornecedor extends PessoaJuridica {
private String contato;
private String produto;
private String servicos;
private String pagamentoCondi;


public Fornecedor() { super(); }


public Fornecedor(Integer id, String nome, String endereco, String telefone, String email,
String cnpj, String inscrEstadual, String nomeFantasia, String representanteLegal,
String contato, String produto, String servicos, String pagamentoCondi) {
super(id, nome, endereco, telefone, email, cnpj, inscrEstadual, nomeFantasia, representanteLegal);
this.contato = contato;
this.produto = produto;
this.servicos = servicos;
this.pagamentoCondi = pagamentoCondi;
}


public String getContato() { return contato; }
public void setContato(String contato) { this.contato = contato; }


public String getProduto() { return produto; }
public void setProduto(String produto) { this.produto = produto; }


public String getServicos() { return servicos; }
public void setServicos(String servicos) { this.servicos = servicos; }


public String getPagamentoCondi() { return pagamentoCondi; }
public void setPagamentoCondi(String pagamentoCondi) { this.pagamentoCondi = pagamentoCondi; }
}