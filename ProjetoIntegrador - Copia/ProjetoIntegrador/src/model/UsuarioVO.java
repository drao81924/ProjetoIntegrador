/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.InputMismatchException;

/**
 *
 * @author jairb
 */
public class UsuarioVO {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public UsuarioVO() {
        //Construtor Vazio para acessar os metodos acessores get e set
    }

    /**
     *
     * @param idUsuario
     * @param nome
     * @param email
     * @param senha
     * @param telefone
     */
    public UsuarioVO(int idUsuario, String nome, String email, String senha, String telefone) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "usuario{" + "idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + '}';
    }

}
