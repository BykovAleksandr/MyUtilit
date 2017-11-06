package com.Utilit.FileAction;

import com.Utilit.EquallyNotEqually.EquallyNotEqually;
import com.Utilit.ParseFile.ParseFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnActionListenerSaveFale {
    public BtnActionListenerSaveFale(JButton btnName){

        btnName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EquallyNotEqually.sortEqulesNotEqules(ParseFile.serchSkuFromTxt, ParseFile.skuFromCSV);
                SaveFile saveFile = new SaveFile(EquallyNotEqually.equles, "C:/Users/bykov/Desktop/MyUtilit/equll/equll.txt");
                SaveFile saveFile1 = new SaveFile(EquallyNotEqually.notEqules, "C:/Users/bykov/Desktop/MyUtilit/not_equll/not-equll.txt");

                JOptionPane.showMessageDialog(null, "Готово!");
            }
        });
    }
}
