/*
 * Funcck nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Funcck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class GerFunc {
    
    private Funcionario func;
    private ArrayList<Funcionario> bdFunc;
    private static GerFunc gpUnic;

    private GerFunc() {
        bdFunc = new ArrayList<Funcionario>();
    }

    //Singleton
    public static GerFunc geraGerFunc() {
        if (gpUnic == null) {
            gpUnic = new GerFunc();
        }
        return gpUnic;
    }

    public List<Funcionario> getBdFunc() {
        return bdFunc;
    }

    public Funcionario insFunc(Funcionario Func) {
        if (consFuncCpf(Func) == null) {
            bdFunc.add(Func);
            return Func;
        } else {
            return null;
        }
    }//fim insPes

    public Funcionario consFuncCpf(Funcionario Func) {
        for (int i = 0; i < bdFunc.size(); i++) {
            if (Func.getCpf().equals(bdFunc.get(i).getCpf())) {
                return bdFunc.get(i);
            }
        }
        return null;
    }//fim consPesCod

    public Funcionario delFuncCpf(Funcionario Func) {
        Funcionario Func1 = consFuncCpf(Func);
        if (Func1 != null) {
            bdFunc.remove(Func1);
            return null;
        } else {
            return Func;
        }

    }//fim removePesCpf

  

    public Funcionario atualizaFuncCpf(Funcionario funcionario) {
        for (int i = 0; i < bdFunc.size(); i++) {
            if (funcionario.getCpf().equals(bdFunc.get(i).getCpf()))  {
                func = bdFunc.get(i);

                String nome = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo NOME",
                        "Atulizar dados",
                        JOptionPane.INFORMATION_MESSAGE
                );

                func.setNome(nome);
                bdFunc.set(i, func);
                return bdFunc.get(i);
            }
        }
        return null;
    }//fim atualizaPesCpf

}
