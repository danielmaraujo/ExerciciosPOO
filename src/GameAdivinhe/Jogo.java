package GameAdivinhe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame {
    private int numero = 10; //(int)Math.random() * 11;

    Jogo(){
        setTitle("ADIVINHE!");
        setSize(700, 300);
        setResizable(false);

        Container c = getContentPane();
        JPanel p = new JPanel();
        c.add(p);

        JLabel textoInicial = new JLabel(
                "Eu tenho um número entre 1 e 100, você pode adivinhá-lo? Entre com seu chute"
        );
        p.add(textoInicial);

        JTextField tfPalpite = new JTextField(15);
        p.add(tfPalpite);

        JLabel resultado = new JLabel();
        p.add(resultado);

        tfPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Integer.parseInt(tfPalpite.getText()) == numero){
                    resultado.setText("Parabéns! Você acertou");
                }else{

                }
            }
        });




        setVisible(true);
    }
}
