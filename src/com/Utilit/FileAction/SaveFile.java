package com.Utilit.FileAction;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveFile {

    public SaveFile(ArrayList<String> stringArrayList, String folderNeme){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(folderNeme))){
            String sortValue;

            for (int i = 0; i < stringArrayList.size(); i++){
                sortValue = stringArrayList.get(i);
                bw.write(sortValue + "\n");
                bw.flush();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);

            //e.printStackTrace();
        }
    }
}
