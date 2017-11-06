package com.Utilit.Gui;

import com.Utilit.FileAction.ActionFileChooser;
import com.Utilit.FileAction.BtnActionListenerSaveFale;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.UnsupportedEncodingException;

public class Display extends JFrame{

    public static String ferstFileFolder;
    public static String secFileFolder;
    //Создаем конструктор рамки
   public Display(){
        // Тайтл
        super("My Utilit версия:1.01");
        // указываем что кнопка закрыть завершает работу программы
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //задаем размер рамки
        setSize(800,300);
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
//создаем 2 кнопки и лейблы к ним------------------------------------------------------------
        JLabel festLabel = new JLabel("Что ищем");
        fileFolderArea.add(festLabel);

        JLabel fileName = new JLabel("Выбранный файл");
        fileFolderArea.add(fileName);

        JButton ferstOpenBtn = new JButton("Загрузить файл");
        fileFolderArea.add(ferstOpenBtn);

        ActionFileChooser actionFileChooser = new ActionFileChooser(ferstOpenBtn, fileName);
//------------------------------------------------------------------------------------------
        JLabel secLabel = new JLabel("Где ищем");
        fileFolderArea.add(secLabel);

        JLabel secFileName = new JLabel("Выбранный файл");
        fileFolderArea.add(secFileName);

        JButton secOpenBtn = new JButton("Загрузить файл");
        fileFolderArea.add(secOpenBtn);

        ActionFileChooser actionFileChooser1 = new ActionFileChooser(secOpenBtn,secFileName);

        getContentPane().add(mainPanel);
//-------------------------------------------------------------------------------------------

        JButton doneBtn = new JButton("Готово");
        fileFolderArea.add(doneBtn);

        JLabel versionLable = new JLabel("версия:1.01");
        fileFolderArea.add(versionLable);


        BtnActionListenerSaveFale btnAction = new BtnActionListenerSaveFale(doneBtn);
    }
}
