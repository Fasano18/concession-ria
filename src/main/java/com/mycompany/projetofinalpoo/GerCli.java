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
public class GerCli {

    private Cliente cli;
    private ArrayList<Cliente> bdCli;
    private static GerCli gpUnic;

    private GerCli() {
        bdCli = new ArrayList<Cliente>();
    }

    //Singleton
    public static GerCli geraGerCli() {
        if (gpUnic == null) {
            gpUnic = new GerCli();
        }
        return gpUnic;
    }

    public List<Cliente> getBdCli() {
        return bdCli;
    }

    public Cliente insCli(Cliente Cli) {
        if (consCliCpf(Cli) == null) {
            bdCli.add(Cli);
            return Cli;
        } else {
            return null;
        }
    }//fim insPes

    public Cliente consCliCpf(Cliente Cli) {
        for (int i = 0; i < bdCli.size(); i++) {
            if (Cli.getCpf().equals(bdCli.get(i).getCpf())) {
                return bdCli.get(i);
            }
        }
        return null;
    }//fim consPesCod

    public Cliente delCliCpf(Cliente Cli) {
        Cliente Cli1 = consCliCpf(Cli);
        if (Cli1 != null) {
            bdCli.remove(Cli1);
            return null;
        } else {
            return Cli;
        }

    }//fim removePesCpf

  

    public Cliente atualizaCliCpf(Cliente cli) {
        for (int i = 0; i < bdCli.size(); i++) {
            if (cli.getCpf().equals(bdCli.get(i).getCpf()))  {
                cli = bdCli.get(i);

                String nome = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo NOME",
                        "Atulizar dados",
                        JOptionPane.INFORMATION_MESSAGE
                );

                cli.setNome(nome);
                bdCli.set(i, cli);
                return bdCli.get(i);
            }
        }
        return null;
    }//fim atualizaPesCpf

}
