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
public abstract class Veiculo {
    // atributos
    private String marca;
    private String modelo;
    private double preco;
    private int placa;

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    // Sobrecarga
    public Veiculo() {
        marca = "";
        modelo = "";
        preco = 0.0;
    }

    // Getter para marca
    public String getMarca() {
        return this.marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para modelo
    public String getModelo() {
        return this.modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) throws ModelogrdException {
        this.modelo = modelo;
        if (modelo.length() > 10) {
            throw new ModelogrdException("Modelo muito grande");
        }
    }

    // Getter para preco
    public double getPreco() {
        return this.preco;
    }

    // Setter para preco
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: " + preco;
    }

}
