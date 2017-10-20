package com.Utilit.FileAction;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ActionFileChooser {

   public ActionFileChooser(JButton btnName, JLabel labbleName){
        btnName.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JFileChooser fileOpen = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Txt file","txt");
                fileOpen.addChoosableFileFilter(filter);

                int ret = fileOpen.showDialog(null, "Открыть файл");

                if (ret == JFileChooser.APPROVE_OPTION){
                    File file  = fileOpen.getSelectedFile();
                    labbleName.setText(file.getName());

                    try {
                        ReadFile readFile = new ReadFile();
                        readFile.readCSVFile(file.getCanonicalPath());
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, e1);
                        //e1.printStackTrace();
                    }
                }
            }
        });
    }
}
