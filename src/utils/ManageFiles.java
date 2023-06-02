/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author user
 */
public class ManageFiles {

    public enum FileTypes {
        JSON, TEXT
    }

    public boolean WriteFile(String FileName, JSONArray content, FileTypes FileType) {
        boolean isDone = false;
        try (FileWriter file = new FileWriter(FileName + (FileType.JSON.toString().toLowerCase().equals("json") ? ".json" : ".txt"))) {
            file.write(content.toJSONString());
            file.flush();
            isDone = true;
        } catch (Exception e) {
            isDone = false;
        }
        return isDone;
    }

    public String ReadFile(String FileName, FileTypes FileType) {
        String Data = "";
        try {
            String fileName = FileName + (FileType.JSON.toString().toLowerCase().equals("json") ? ".json" : ".txt");
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                Data += line;
            }
        } catch (Exception ex) {
            Data = null;
        }
        return Data;
    }
}
