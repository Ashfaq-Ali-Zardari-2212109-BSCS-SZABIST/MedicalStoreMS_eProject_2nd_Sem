/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medicalstorems_eproject_2nd_sem;

import Forms.LoginForm;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import utils.ManageFiles;

/**
 *
 * @author user
 */
public class MedicalStoreMS_eProject_2nd_Sem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppSetup();
    }

    private static void AppSetup() {
        try {
            String FileName = "AppSettings";
            File tempFile = new File(FileName + ".json");
            boolean exists = tempFile.exists();
            System.out.println(exists);
            if (!exists) {
                JSONObject DBConfig = new JSONObject();
                DBConfig.put("DBServer", "kkkk");
                DBConfig.put("DBName", "MedicalStoreDB");
                DBConfig.put("DBUser", "sa");
                DBConfig.put("DBPassword", "1234");
                JSONObject DBSettings = new JSONObject();
                DBSettings.put("DBSettings", DBConfig);
                JSONObject AppConfig = new JSONObject();
                AppConfig.put("AppName", "Medical Store");
                AppConfig.put("AppLicenseKey", "KS234-CK966-41HK7-BA823-OK276");
                AppConfig.put("Owner", "Bushra Barkat Shaikh");
                JSONObject AppSettings = new JSONObject();
                AppSettings.put("AppSettings", AppConfig);
                JSONArray AppSettingsArray = new JSONArray();
                AppSettingsArray.add(DBSettings);
                AppSettingsArray.add(AppSettings);
                ManageFiles files = new ManageFiles();
                if (files.writeFile(FileName, AppSettingsArray, ManageFiles.FileTypes.JSON)) {
                    new LoginForm().setVisible(true);
                }
            }
        } catch (Exception ex) {
//            Logger.getLogger(MedicalStoreMS_eProject_2nd_Sem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
