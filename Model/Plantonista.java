/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Funcionario;
import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Plantonista extends Funcionario implements PlantonistaFucionario {

    private int horas;

    //Construtor
    public Plantonista(String nome, String cargo, String setor, int matricula, int telefone, String genero, String dataAdmissao, int horas, String t) {
        super(nome, cargo, setor, matricula, telefone, genero, dataAdmissao, t);
        this.horas = horas;
    }


    @Override
    public void imprimir() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Setor: " + this.setor);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Genero: " + this.genero);
        System.out.println("Data de Admissão: " + this.dataAdmissao + "\n");

    }

    public void enviarMsg() {
        System.out.println("Olá Car@" + this.nome + ". Hoje é o seu dia de plantão no hospital." + "\n"
                + "Pois precisa cumprir as horas necessárias " + this.horas + "% de\n"
                + "horas”.");
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horasTrabalhadas) {
        this.horas = horas;
    }

}
