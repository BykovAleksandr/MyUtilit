package com.Utilit.main;

import com.Utilit.EquallyNotEqually.EquallyNotEqually;
import com.Utilit.FileAction.ReadFile;
import com.Utilit.Gui.Display;
import com.Utilit.ParseFile.ParseFile;

public class Main {
    public static void main(String[] args) {
        //GUI part disable
        /*Display mainDisplay = new Display();
        mainDisplay.pack();
        mainDisplay.setVisible(true);
        */

        ReadFile readFile = new ReadFile();
        readFile.readCSVFile("res//chtoishem.txt");

        ReadFile secReadFile1 = new ReadFile();
        secReadFile1.readCSVFile("res//gdeishem.txt");


        EquallyNotEqually.sortEqulesNotEqules(ParseFile.serchSkuFromTxt, ParseFile.skuFromCSV);

        for (String print : EquallyNotEqually.equles)
            System.out.println("Есть совпадение: " + print);

        System.out.println();

        for (String print2 : EquallyNotEqually.notEqules)
            System.out.println("Нет совпадений: " + print2);

        System.out.println();


    }
}
