/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Endereco;
import br.com.wendel.pdv.entity.Pessoa;
import br.com.wendel.pdv.entity.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author Wendel
 */
public class PessoaDao {

    private final Connection connection;

    public PessoaDao(Connection connection) {
        this.connection = connection;
    }

    public Pessoa salvar(Pessoa pessoa) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO pessoa (cpf_cnpj,\n");
        query.append("                    descricao,\n");
        query.append("                    data_nascimento,\n");
        query.append("                    tipo,\n");
        query.append("                    telefone_celular,\n");
        query.append("                    telefone_fixo)\n");
        query.append("            VALUES (?,?,?,?,?,?)\n");
        query.append("         RETURNING id\n");
        try (PreparedStatement ps = this.connection.prepareStatement(query.toString())) {
            int index = 0;
            if (pessoa.getCpfCnpj() != null && !pessoa.getCpfCnpj().isEmpty()) {
                ps.setString(++index, pessoa.getCpfCnpj());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            ps.setString(++index, pessoa.getDescricao());
            if (pessoa.getDataNascimento() != null) {
                ps.setDate(++index, new java.sql.Date(pessoa.getDataNascimento().getTime()));
            } else {
                ps.setNull(++index, Types.DATE);
            }
            ps.setString(++index, pessoa.getTipoPessoa().getId());
            if (pessoa.getTelefoneCelular() != null && !pessoa.getTelefoneCelular().isEmpty()) {
                ps.setString(++index, pessoa.getTelefoneCelular());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            if (pessoa.getTelefoneFixo() != null && !pessoa.getTelefoneFixo().isEmpty()) {
                ps.setString(++index, pessoa.getTelefoneFixo());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pessoa.setId(rs.getLong("id"));
                }
            }
        }
        return pessoa;
    }

    public void atualizar(Pessoa pessoa) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE pessoa SET cpf_cnpj = ?,\n");
        query.append("                  descricao = ?,\n");
        query.append("                  data_nascimento = ?,\n");
        query.append("                  tipo = ?,\n");
        query.append("                  telefone_celular = ?,\n");
        query.append("                  telefone_fixo = ?\n");
        query.append("            WHERE id = ?\n");
        try (PreparedStatement ps = this.connection.prepareStatement(query.toString())) {
            int index = 0;
            if (pessoa.getCpfCnpj() != null && !pessoa.getCpfCnpj().isEmpty()) {
                ps.setString(++index, pessoa.getCpfCnpj());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            ps.setString(++index, pessoa.getDescricao());
            if (pessoa.getDataNascimento() != null) {
                ps.setDate(++index, new java.sql.Date(pessoa.getDataNascimento().getTime()));
            } else {
                ps.setNull(++index, Types.DATE);
            }
            ps.setString(++index, pessoa.getTipoPessoa().getId());
            if (pessoa.getTelefoneCelular() != null && !pessoa.getTelefoneCelular().isEmpty()) {
                ps.setString(++index, pessoa.getTelefoneCelular());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            if (pessoa.getTelefoneFixo() != null && !pessoa.getTelefoneFixo().isEmpty()) {
                ps.setString(++index, pessoa.getTelefoneFixo());
            } else {
                ps.setNull(++index, Types.VARCHAR);
            }
            ps.setLong(++index, pessoa.getId());
            ps.executeUpdate();
        }
    }

    public void deletar(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM pessoa WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public Pessoa procurarPorId(Long id) throws Exception {
        StringBuilder query = new StringBuilder();
        query.append("SELECT cpf_cnpj,\n");
        query.append("       descricao,\n");
        query.append("       data_nascimento,\n");
        query.append("       tipo,\n");
        query.append("       telefone_celular,\n");
        query.append("       telefone_fixo\n");
        query.append("  FROM pessoa\n");
        query.append(" WHERE id = ?\n");
        try (PreparedStatement ps = this.connection.prepareStatement(query.toString())) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Pessoa(rs.getLong("id"),
                            rs.getString("cpf_cnpj"),
                            rs.getString("descricao"),
                            rs.getDate("data_nascimento"),
                            TipoPessoa.get(rs.getString("tipo")),
                            rs.getString("telefone_celular"),
                            rs.getString("telefone_fixo"),
                            new Endereco());
                }
            }
        }
        return null;
    }
}
