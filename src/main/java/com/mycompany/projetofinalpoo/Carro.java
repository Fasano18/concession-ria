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
public class Carro extends Veiculo {

    private String tipoCombustivel;
    private int airbags;

    public Carro() {
        super();
        tipoCombustivel = "";
    }

    //Sobrecarga
    public Carro(String tipoCombustivel) {
        super();
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Preço: " + getPreco() + ", tipoCombustivel: " + getTipoCombustivel() + ", airbags: " + getAirbags();
    }
}
