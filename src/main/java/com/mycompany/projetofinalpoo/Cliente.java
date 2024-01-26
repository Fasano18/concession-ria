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
public class Cliente extends Pessoa {

    private String carteira;
    private String categoria;

    public Cliente() {
        carteira = "";
        categoria = "";
    }
        
    //Sobrecarga
    public Cliente(String carteira, String categoria) {
        this.carteira = carteira;
        this.categoria = categoria;
    }

    public String getCarteira() {
        return carteira;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf() + ", Carteira: " + carteira + ", Categoria: " + categoria;
    }
}
