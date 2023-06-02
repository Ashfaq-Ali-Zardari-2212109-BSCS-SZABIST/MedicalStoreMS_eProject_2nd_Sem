/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medicalstorems_eproject_2nd_sem;

import Forms.LoginForm;
import forms.AppSettingsForm;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import utils.AAZAppUtils;
import utils.ManageFiles;
import utils.ManageFiles.FileTypes;

/**
 *
 * @author user
 */
public class MedicalStoreMS_eProject_2nd_Sem {

    private static AAZAppUtils AAZAppUtils;
    private static ManageFiles Files;

    private static void InitAppComponents() {
        AAZAppUtils = new AAZAppUtils();
        Files = new ManageFiles();
//        String AppSettingsStr = Files.ReadFile("AppSettings", FileTypes.JSON);
//        AAZAppUtils.GetAppSettings(AppSettingsStr);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InitAppComponents();
        String FileName = "AppSettings";
        File tempFile = new File(FileName + ".json");
        boolean exists = tempFile.exists();
        if (!exists) {
            AAZAppUtils.OpenForm(new AppSettingsForm(), 5000);
        } else {
            AAZAppUtils.OpenForm(new LoginForm(), 5000);
        }
    }

}
