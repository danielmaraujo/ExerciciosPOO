package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
    //JFrame f;

    Janela(){
        setTitle("Calculadora");
        setSize(160, 250);

        Container c = getContentPane();

        JPanel painel = new JPanel();
        c.add(painel);

        JLabel valor1 = new JLabel("Valor 1:");
        painel.add(valor1);

        JTextField tfValor1 = new JTextField(10);
        painel.add(tfValor1);



        JLabel valor2 = new JLabel("Valor 2:");
        painel.add(valor2);

        JTextField tfValor2 = new JTextField(10);
        painel.add(tfValor2);

        JLabel resultado = new JLabel("Resultado:");
        painel.add(resultado);

        JTextArea taResultado = new JTextArea(1, 10);
        taResultado.setEditable(false);
        painel.add(taResultado);

        JButton btnSoma = new JButton("+");
        painel.add(btnSoma);
        btnSoma.setBackground(Color.white);
        JButton btnSub = new JButton("-");
        painel.add(btnSub);
        btnSub.setBackground(Color.white);
        JButton btnMult = new JButton("*");
        painel.add(btnMult);
        btnMult.setBackground(Color.white);
        JButton btnDiv = new JButton("/");
        painel.add(btnDiv);
        btnDiv.setBackground(Color.white);

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(tfValor1.getText().isBlank()) && !(tfValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(tfValor1.getText()), Double.parseDouble(tfValor2.getText()));
                    taResultado.setText(calc.sum());
                }
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(tfValor1.getText().isBlank()) && !(tfValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(tfValor1.getText()), Double.parseDouble(tfValor2.getText()));
                    taResultado.setText(calc.sub());
                }
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(tfValor1.getText().isBlank()) && !(tfValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(tfValor1.getText()), Double.parseDouble(tfValor2.getText()));
                    taResultado.setText(calc.mult());
                }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!(tfValor1.getText().isBlank()) && !(tfValor2.getText().isBlank())){
                    Calculadora calc = new Calculadora(Double.parseDouble(tfValor1.getText()), Double.parseDouble(tfValor2.getText()));
                    taResultado.setText(calc.div());
                }
            }
        });

        setVisible(true);
        repaint();
    }

}
