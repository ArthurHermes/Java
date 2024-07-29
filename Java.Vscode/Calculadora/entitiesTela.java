import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.*;


public class entitiesTela extends JFrame {

    Color purple = new Color(128, 0, 255);
    Font Arial = new Font("Arial",Font.PLAIN ,20);
    TextField txt = new TextField();
    public int valor;


    public entitiesTela(){
        setTitle("Calculadora");
        setSize(390, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setResizable(false);



        /////////////////////////////////////






        //Botões


        //Botão de igual

        JButton equalButton = new JButton();
        equalButton.setBounds(279, 477, 90,180);
        equalButton.setText("=");
        equalButton.setVisible(true);        
        equalButton.setBackground(purple);
        equalButton.setForeground(Color.WHITE);
        equalButton.setFont(Arial);

        add(equalButton);


        //Botão de apagar

        JButton delButton = new JButton();
        delButton.setBounds(279, 203, 90,90);
        delButton.setText("C");
        delButton.setVisible(true);        
        delButton.setBackground(purple);
        delButton.setForeground(Color.WHITE);
        delButton.setFont(Arial);

        add(delButton);


        // Botão de mais
        JButton addButton = new JButton();
        addButton.setBounds(279, 294, 90,180);
        addButton.setText("+");
        addButton.setVisible(true);        
        addButton.setBackground(purple);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(Arial);

        add(addButton);

        //Botão de menos

        JButton minuButton = new JButton();
        minuButton.setBounds(187, 203, 90,90);
        minuButton.setText("-");
        minuButton.setVisible(true);        
        minuButton.setBackground(purple);
        minuButton.setForeground(Color.WHITE);
        minuButton.setFont(Arial);

        add(minuButton);

        //Botão de multiplicação

        JButton multiButton = new JButton();
        multiButton.setBounds(96, 203, 90,90);
        multiButton.setText("x");
        multiButton.setVisible(true);        
        multiButton.setBackground(purple);
        multiButton.setForeground(Color.WHITE);
        multiButton.setFont(Arial);

        add(multiButton);


        // Botão de divisão

        JButton diviButton = new JButton();
        diviButton.setBounds(5, 203, 90,90);
        diviButton.setText("÷");
        diviButton.setVisible(true);        
        diviButton.setBackground(purple);
        diviButton.setForeground(Color.WHITE);
        diviButton.setFont(Arial);

        add(diviButton);


        //0
        JButton jb0 = new JButton();
        jb0.setBounds(5, 567, 272, 90);
        jb0.setText("0");
        jb0.setVisible(true);        
        jb0.setBackground(purple);
        jb0.setForeground(Color.WHITE);
        jb0.setFont(Arial);

        add(jb0);


        //1
        JButton jb1 = new JButton();
        jb1.setBounds(187, 476, 90, 90);
        jb1.setText("1");
        jb1.setVisible(true);        
        jb1.setBackground(purple);
        jb1.setForeground(Color.WHITE);
        jb1.setFont(Arial);
        
        add(jb1);


        //2
        JButton jb2 = new JButton();
        jb2.setBounds(96, 476, 90, 90);
        jb2.setText("2");
        jb2.setVisible(true);        
        jb2.setBackground(purple);
        jb2.setForeground(Color.WHITE);
        jb2.setFont(Arial);
        
        add(jb2);

        //3
        JButton jb3 = new JButton();
        jb3.setBounds(5, 476, 90, 90);
        jb3.setText("3");
        jb3.setVisible(true);        
        jb3.setBackground(purple);
        jb3.setForeground(Color.WHITE);
        jb3.setFont(Arial);
        
        add(jb3);

        //4
        JButton jb4 = new JButton();
        jb4.setBounds(5, 385, 90, 90);
        jb4.setText("4");
        jb4.setVisible(true);        
        jb4.setBackground(purple);
        jb4.setForeground(Color.WHITE);
        jb4.setFont(Arial);

        add(jb4);

        //5
        JButton jb5 = new JButton();
        jb5.setBounds(96, 385, 90, 90);
        jb5.setText("5");
        jb5.setVisible(true);        
        jb5.setBackground(purple);
        jb5.setForeground(Color.WHITE);
        jb5.setFont(Arial);

        add(jb5);

        //6
        JButton jb6 = new JButton();
        jb6.setBounds(187, 385, 90, 90);
        jb6.setText("6");
        jb6.setVisible(true);        
        jb6.setBackground(purple);
        jb6.setForeground(Color.WHITE);
        jb6.setFont(Arial);

        add(jb6);

        //7
        JButton jb7 = new JButton();
        jb7.setBounds(5, 294, 90, 90);
        jb7.setText("7");
        jb7.setVisible(true);        
        jb7.setBackground(purple);
        jb7.setForeground(Color.WHITE);
        jb7.setFont(Arial);

        add(jb7);

        //8
        JButton jb8 = new JButton();
        jb8.setBounds(96, 294, 90, 90);
        jb8.setText("8");
        jb8.setVisible(true);        
        jb8.setBackground(purple);
        jb8.setForeground(Color.WHITE);
        jb8.setFont(Arial);

        add(jb8);

        //9
        JButton jb9 = new JButton();
        jb9.setBounds(187, 294, 90, 90);
        jb9.setText("9");
        jb9.setVisible(true);        
        jb9.setBackground(purple);
        jb9.setForeground(Color.WHITE);
        jb9.setFont(Arial);


        add(jb9);
        
       
    }


}
