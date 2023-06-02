/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author user
 */
public class ManageFiles {

    public enum FileTypes {
        JSON, TEXT
    }

    public boolean writeFile(String FileName, JSONArray content, FileTypes FileType) {
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

    public boolean readFile(String FileName, JSONArray content, FileTypes FileType) {
        boolean isDone = false;
        try (FileReader reader = new FileReader(FileName + (FileType.JSON.toString().toLowerCase().equals("json") ? ".json" : ".txt"))) {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));
            isDone = true;
        } catch (Exception e) {
            isDone = false;
        }
        return isDone;
    }

    private static void parseEmployeeObject(JSONObject json) {
        //Get json object within list
        JSONObject employeeObject = (JSONObject) json.get("employee");

        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        //Get employee website name
        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
