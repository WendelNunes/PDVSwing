/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

import java.util.Date;

/**
 *
 * @author Wendel
 */
public class Pessoa {

    private Long id;
    private String cpfCnpj;
    private String descricao;
    private Date dataNascimento;
    private TipoPessoa tipoPessoa;
    private boolean fornecedor;
    private boolean cliente;
    private String telefoneCelular;
    private String telefoneFixo;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(Long id, String cpfCnpj, String descricao, Date dataNascimento, TipoPessoa tipoPessoa, boolean fornecedor, boolean cliente, String telefoneCelular, String telefoneFixo, Endereco endereco) {
        this.id = id;
        this.cpfCnpj = cpfCnpj;
        this.descricao = descricao;
        this.dataNascimento = dataNascimento;
        this.tipoPessoa = tipoPessoa;
        this.fornecedor = fornecedor;
        this.cliente = cliente;
        this.telefoneCelular = telefoneCelular;
        this.telefoneFixo = telefoneFixo;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
    
    
}
