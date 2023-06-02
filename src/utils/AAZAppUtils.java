/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import Forms.LoginForm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.AppSettingsModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author user
 */
public class AAZAppUtils {

    public void OpenForm(JFrame form, int delay) {
        sleepThread(delay);
        java.awt.EventQueue.invokeLater(() -> {
            form.setVisible(true);
        });
    }

    private void sleepThread(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error, something went wrong.",
                    //                    ex.getMessage(),
                    "Error", 0);
        }
    }

    public AppSettingsModel GetAppSettings(String JsonString) {
        AppSettingsModel Settings = null;
        try {
            JSONParser jsonParser = new JSONParser();
            JSONArray JsonArray = (JSONArray) jsonParser.parse(JsonString);
            Settings = new AppSettingsModel();
            for (Object o : JsonArray) {
                JSONObject person = (JSONObject) o;
                Settings.DBSettings.DBServer = (String) person.get("DBServer");
                Settings.DBSettings.DBName = (String) person.get("DBName");
                Settings.DBSettings.DBUser = (String) person.get("DBUser");
                Settings.DBSettings.DBPassword = (String) person.get("DBPassword");
            }
        } catch (Exception ex) {
            Settings = null;
            JOptionPane.showMessageDialog(null,
                    "Error, something went wrong.",
                    //                    ex.getMessage(),
                    "Error", 0);
        }
        return Settings;
    }

    public boolean WriteAppSettings(String FileName, String AppName, String AppLicenseKey, String AppOwner, String DBServer, String DBName, String DBUser, String DBPassword) {
        ManageFiles Files = new ManageFiles();
        JSONObject AppSettings = new JSONObject();
        AppSettings.put("DBServer", DBServer);
        AppSettings.put("DBName", DBName);
        AppSettings.put("DBUser", DBUser);
        AppSettings.put("DBPassword", DBPassword);
        JSONObject DBSettings = new JSONObject();
        AppSettings.put("AppName", AppName);
        AppSettings.put("AppLicenseKey", AppLicenseKey);
        AppSettings.put("AppOwner", AppOwner);
        JSONArray AppSettingsArray = new JSONArray();
        AppSettingsArray.add(AppSettings);
        return Files.WriteFile(FileName, AppSettingsArray, ManageFiles.FileTypes.JSON);
    }
}
