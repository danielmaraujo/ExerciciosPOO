package Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LivroGUI {
    private JTextField tfTitulo;
    private JTextField tfQtdePaginas;
    private JLabel titulo;
    private JLabel qtdePag;
    private JPanel painel;
    private JPanel botoes;
    private JButton btnadicionar;
    private JButton btnlistar;
    private JPanel campos;

    private ArrayList<Livro> listaLivros = new ArrayList<Livro>(200);

    public LivroGUI() {
        btnadicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listaLivros.add(new Livro(tfTitulo.getText(), Integer.parseInt(tfQtdePaginas.getText())));
                tfTitulo.setText("");
                tfQtdePaginas.setText("");
            }
        });
        btnlistar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame2 = new JFrame("Lista de livros");
                frame2.setContentPane(new Listagem(listaLivros).painel);
                frame2.pack();
                frame2.setVisible(true);

            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("LivroGUI");
        frame.setContentPane(new LivroGUI().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
