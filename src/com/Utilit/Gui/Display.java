package com.Utilit.Gui;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame{

    public Display()
    {
        // создаем окно и задаем ему параметры
        super("My Utilit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(600,200,800,600);
        createLable();
        createBTN();

    }

    public void createLable(){
        Container container = new Container();

        JLabel lable = new JLabel("Выберите метод");
        lable.setBounds(15,5,300,25);
        container.add(lable);

        getContentPane().add(container);
    }

    public void createBTN(){
        Container container = new Container();

        ButtonGroup radioBtnGroup = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("SKU serch");
        JRadioButton radioButton2 = new JRadioButton("Serch & sort");
        radioButton.setBounds(15,30,300,25);
        radioButton2.setBounds(15,60,300,25);
        radioBtnGroup.add(radioButton);
        radioBtnGroup.add(radioButton2);

        container.add(radioButton);
        radioButton.setSelected(true);
        container.add(radioButton2);

        getContentPane().add(container);

    }
}
