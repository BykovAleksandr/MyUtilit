package com.Utilit.EquallyNotEqually;

import com.Utilit.ParseFile.ParseFile;

import java.util.ArrayList;

public class EquallyNotEqually {

    public static ArrayList<String> equles = new ArrayList<>();
    public static ArrayList<String> notEqules = new ArrayList<>();

    public static void sortEqulesNotEqules(ArrayList<String> serchSkuFromTxt, ArrayList<String> skuFromCSV) {

        for (int i = 0; i < serchSkuFromTxt.size(); i++){

            boolean notEqualles = false;

            for (int y = 0; y < skuFromCSV.size(); y++){

                if (serchSkuFromTxt.get(i).equals(skuFromCSV.get(y))){
                    notEqualles = true;
                    equles.add(serchSkuFromTxt.get(i));
                    break;
                }
            }

            if (notEqualles == false){
                notEqules.add(serchSkuFromTxt.get(i));
            }
        }
    }
}