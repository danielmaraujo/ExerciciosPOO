package Livro;

import javax.swing.*;
import java.util.ArrayList;

public class Listagem {
    public JPanel painel;
    private ArrayList<Livro> lista;

    public Listagem(ArrayList<Livro> lista) {
        this.lista = lista;
    }

    private JList list1;


    private void createUIComponents() {
        list1 = new JList(lista.toArray());
    }
}
