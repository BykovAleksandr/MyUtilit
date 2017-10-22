package com.Utilit.ParseFile;

import com.Utilit.EquallyNotEqually.EquallyNotEqually;

import java.util.ArrayList;

public class ParseFile {
    // массив для что ищем
    public static ArrayList<String> serchSkuFromTxt = new ArrayList<>();
    public static ArrayList<String> skuFromCSV = new ArrayList<>();

    //Метод рапарсивает, полученую строку и передает в метод
    public static void readAndParsSemicolonFile(String strInLine) {

        if (strInLine.contains(";")) {

            for (String inVallStrings : strInLine.split(";")) {

                if (inVallStrings.contains("=")) {

                    for (String tmp : inVallStrings.split("=")) {
                        skuFromCSV.add(tmp);
                        break;
                    }
                }

            }
        } else {
            serchSkuFromTxt.add(strInLine);
        }
    }
}
