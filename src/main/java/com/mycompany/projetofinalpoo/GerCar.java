/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;
//Leonardo Fasano RA:2564211

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class GerCar {

    private Carro car;
    private ArrayList<Carro> bdCar;
    private static GerCar gpUnic;

    private GerCar() {
        bdCar = new ArrayList<Carro>();
    }

    //Singleton
    public static GerCar geraGerCar() {
        if (gpUnic == null) {
            gpUnic = new GerCar();
        }
        return gpUnic;
    }

    public List<Carro> getBdCar() {
        return bdCar;
    }

    public Carro insCar(Carro car) {
        if (consCarPlaca(car) == null) {
            bdCar.add(car);
            return car;
        } else {
            return null;
        }
    }//fim insPes

    public Carro consCarPlaca(Carro car) {
        for (int i = 0; i < bdCar.size(); i++) {
            if (car.getPlaca() == bdCar.get(i).getPlaca()) {
                return bdCar.get(i);
            }
        }
        return null;
    }//fim consPesCod

    public Carro delCarPlaca(Carro car) {
        Carro car1 = consCarPlaca(car);
        if (car1 != null) {
            bdCar.remove(car1);
            return null;
        } else {
            return car;
        }

    }//fim removePesCpf

    public Carro atualizaCarPlaca(Carro car) {
        for (int i = 0; i < bdCar.size(); i++) {
            if (car.getPlaca() == bdCar.get(i).getPlaca()) {
                car = bdCar.get(i);

                String placa = JOptionPane.showInputDialog(
                        null,
                        "Informe uma nova Placa",
                        "Atulizar dados",
                        JOptionPane.INFORMATION_MESSAGE
                );

                car.setPlaca(Integer.valueOf(placa));

                bdCar.set(i, car);
                return bdCar.get(i);
            }
        }
        return null;
    }

}//fim da classe

