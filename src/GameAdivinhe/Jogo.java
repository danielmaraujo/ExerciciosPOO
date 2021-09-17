package GameAdivinhe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo {
    private int numero = (int)(Math.random() * 100) + 1;
    private JPanel panel1;
    private JLabel resultado;
    private JLabel label1;
    private JLabel label2;
    private JTextField tfPalpite;
    private JButton novoJogoButton;

    public Jogo() {
        tfPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int palpite = Integer.parseInt(tfPalpite.getText());
                if (palpite <= 100 && palpite >=1){
                    if(palpite == numero){
                        resultado.setText("Parabéns! Você acertou");
                        tfPalpite.setEditable(false);
                        novoJogoButton.setVisible(true);
                    }
                    else{
                        if(palpite > numero - 20 && palpite < numero+20){
                            resultado.setText("Mais perto");
                            tfPalpite.setBackground(Color.blue);
                        }
                        else{
                            resultado.setText("Mais longe");
                            tfPalpite.setBackground(Color.red);
                        }
                    }
                }
                else{
                    resultado.setText("Valor inserido não está entre 1 e 100");
                }
            }
        });


        novoJogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numero = (int)(Math.random() * 100) + 1;
                tfPalpite.setEditable(true);
                resultado.setText("");
                novoJogoButton.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela");
        frame.setContentPane(new Jogo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
