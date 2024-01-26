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
public class GerMoto {

    private Moto mot;
    private ArrayList<Moto> bdMot;
    private static GerMoto gpUnic;

    private GerMoto() {
        bdMot = new ArrayList<Moto>();
    }

    //Singleton
    public static GerMoto geraGerMot() {
        if (gpUnic == null) {
            gpUnic = new GerMoto();
        }
        return gpUnic;
    }

    public List<Moto> getBdMot() {
        return bdMot;
    }

    public Moto insMoto(Moto mot) {
        if (consMotoPlaca(mot) == null) {
            bdMot.add(mot);
            return mot;
        } else {
            return null;
        }
    }//fim insPes

    public Moto consMotoPlaca(Moto mot) {
        for (int i = 0; i < bdMot.size(); i++) {
            if (mot.getPlaca() == bdMot.get(i).getPlaca()) {
                return bdMot.get(i);
            }
        }
        return null;
    }//fim consPesCod

    public Moto delMotPlaca(Moto mot) {
        Moto mot1 = consMotoPlaca(mot);
        if (mot1 != null) {
            bdMot.remove(mot1);
            return null;
        } else {
            return mot;
        }

    }//fim removePesCpf

    public Moto atualizaMotPlaca(Moto mot) {
        for (int i = 0; i < bdMot.size(); i++) {
            if (mot.getPlaca() == bdMot.get(i).getPlaca()) {
                mot = bdMot.get(i);

                String placa = JOptionPane.showInputDialog(
                        null,
                        "Informe uma nova Placa",
                        "Atulizar dados",
                        JOptionPane.INFORMATION_MESSAGE
                );

                mot.setPlaca(Integer.valueOf(placa));

                bdMot.set(i, mot);
                return bdMot.get(i);
            }
        }
        return null;
    }

}//fim da classe

