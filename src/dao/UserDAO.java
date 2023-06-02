/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import abstractractions.absUser;
import utils.DBConnection;
import models.UserModel;

/**
 *
 * @author user
 */
public class UserDAO extends absUser {

    private DBConnection DB;

    @Override
    public UserModel Login(String Username, String Password) {
        UserModel User = null;
        if (Username.equals("") || Password.equals("")) {
            return User;
        }
        
        return User;
    }

    @Override
    public boolean Logout() {
        boolean IsLoggedIn = false;

        return IsLoggedIn;
    }

}
