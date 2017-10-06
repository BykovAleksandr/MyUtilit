package com.Utilit.Gui;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import java.awt.*;

public class Display extends JFrame{
    //Создаем конструктор рамки
   public Display(){
        // Тайтл
        super("My Utlit. Choose a method");
        // указываем что кнопка закрыть завершает работу программы
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //задаем размер рамки
        setSize(600,600);
        // Запрещаем менять размер рамки
        setResizable(false);
        // Задаем позиционирование рамки по середине
        this.setLocationRelativeTo(null);
        //this.pack();

       creatGUI();
    }

    private void creatGUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel sortEndSerch = new JPanel();
        Border all = BorderFactory.createTitledBorder("Сортировать по совпадению");
        sortEndSerch.setBorder(all);
        mainPanel.add(sortEndSerch, BorderLayout.CENTER);

        JLabel label = new JLabel("Через файл/в ручную (Да через файл/Нет в ручную)  (Д/Н)");
        sortEndSerch.add(label);

        ButtonGroup btnGroop = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("Д");
        JRadioButton radioButton2 = new JRadioButton("Н");
        btnGroop.add(radioButton);
        btnGroop.add(radioButton2);
        radioButton.setSelected(true);
        sortEndSerch.add(radioButton);
        sortEndSerch.add(radioButton2);

        JButton btnOk = new JButton("Окей");

        getContentPane().add(mainPanel);

    }
}
