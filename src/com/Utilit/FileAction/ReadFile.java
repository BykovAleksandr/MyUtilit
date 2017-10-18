package com.Utilit.FileAction;

import com.Utilit.ParseFile.ParseFile;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {
// Метод открывает файл и передает строку

    public void readCSVFile(String nameFolder){
        try {
            FileInputStream fsReader = new FileInputStream(nameFolder);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fsReader));

            String strInLine;

            while ((strInLine = reader.readLine()) != null){

                ParseFile.readAndParsSemicolonFile(strInLine);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Файл не найден!" + "\n" + "Укажите путь к файлу!");
            //readCSVFile();
        }
    }
}
