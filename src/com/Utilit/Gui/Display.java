package com.Utilit.Gui;

import com.Utilit.main.Main;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Display extends JFrame{
    //Создаем конструктор рамки
   public Display(){
        // Тайтл
        super("My Utilit");
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

        JPanel fileFolderArea = new JPanel();
        Border all = BorderFactory.createTitledBorder("Равно не Равно");
        fileFolderArea.setBorder(all);
        mainPanel.add(fileFolderArea, BorderLayout.CENTER);

//создаем 2 кнопки и лейблы к ним
        JLabel festLabel = new JLabel("Что ищем");
        fileFolderArea.add(festLabel);

        JLabel fileName = new JLabel("Выбранный файл");
        fileFolderArea.add(fileName);

        JButton ferstOpenBtn = new JButton("Загрузить файл");
        fileFolderArea.add(ferstOpenBtn);

        actionBtn(ferstOpenBtn, fileName);

        JLabel secLabel = new JLabel("Где ищем");
        fileFolderArea.add(secLabel);

        JButton secOpenBtn = new JButton("Загрузить файл");
        fileFolderArea.add(secOpenBtn);

        getContentPane().add(mainPanel);


/*
        ferstOpenBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileOpen = new JFileChooser();
                int ret = fileOpen.showDialog(null, "Открыть файл");

                if (ret == JFileChooser.APPROVE_OPTION){
                   File file  = fileOpen.getSelectedFile();
                   fileName.setText(file.getName());
                   Main.ferstFileFolder = file.getPath();
                }
            }
        });
        */
    }

    public void actionBtn(JButton btnName, JLabel labbleName){
        btnName.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent e) {
               JFileChooser fileOpen = new JFileChooser();
               int ret = fileOpen.showDialog(null, "Открыть файл");

               if (ret == JFileChooser.APPROVE_OPTION){
                   File file  = fileOpen.getSelectedFile();
                   labbleName.setText(file.getName());
                   Main.ferstFileFolder = file.getPath();
               }
           }
       });
    }
}
