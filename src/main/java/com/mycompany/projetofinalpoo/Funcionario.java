/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;

/**
 *
 * @author leona
 */
//Leonardo Fasano RA:2564211
public class Funcionario extends Pessoa implements Calc {

    private double salario;
    private String cargo;
    private double salarioAnual;

    public Funcionario() {
        salario = 0;
        cargo = "";
    }
    
    //Sobrecarga
    public Funcionario(double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioAnual() {
        return calcular();
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;

    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + salario + ", Cargo: " + cargo
                + ", Salário Anual: " + getSalarioAnual();
    }

    // SobreEscrita
    @Override
    public double calcular() {
        System.out.println("Calculando o salario anual");
        return getSalario() * 12;
    }

}
