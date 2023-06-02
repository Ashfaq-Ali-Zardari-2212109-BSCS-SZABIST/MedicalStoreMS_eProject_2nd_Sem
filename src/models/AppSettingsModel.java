/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */


public class AppSettingsModel {
public class AppSettings {

    public String AppName;
    public String AppOwner;
    public String AppLicenseKey;
}

public class DBSettings {

    public String DBServer;
    public String DBPassword;
    public String DBName;
    public String DBUser;
}
    public DBSettings DBSettings;
    public AppSettings AppSettings;
}
