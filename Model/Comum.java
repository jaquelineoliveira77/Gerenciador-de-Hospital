/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Model.Funcionario;
import java.util.Date;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Comum extends Funcionario {

    public Comum(String nome, String cargo, String setor, int matricula, int telefone, String genero, String dataAdmissao ,String turno) {
        super(nome, cargo, setor, matricula, telefone, genero, dataAdmissao , turno);
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
    

}
