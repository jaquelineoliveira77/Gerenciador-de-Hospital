/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Jaqueline Oliveira
 */
public abstract class Funcionario implements Serializable{

    //Atributos
    protected String nome;
    protected String cargo;
    protected String setor;
    protected int matricula;
    protected int telefone;
    protected String genero;
    protected String dataAdmissao;
     protected String turno;

    //Construtor
    public Funcionario(String nome, String cargo, String setor, int matricula, int telefone, String genero, String dataAdmissao , String turno) {
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
        this.matricula = matricula;
        this.telefone = telefone;
        this.genero = genero;
        this.dataAdmissao = dataAdmissao;
        this.turno =  turno;

    }

    //Métodos
    public abstract void imprimir();

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDateAdmissao(String dateAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
