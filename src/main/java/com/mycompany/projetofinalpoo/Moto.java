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
public class Moto extends Veiculo {
  private int cilindrada;
  private String tipo;

  // Sobrecarga
  public Moto() {
    super();
    cilindrada = 0;
  }

  // Getter para cilindrada
  public int getCilindrada() {
    return this.cilindrada;
  }

  // Setter para cilindrada
  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Preço: " + getPreco() + ", Cilindrada: "
        + getCilindrada() + ", Tipo: " + getTipo();
  }

}
