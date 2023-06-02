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

    private DBConnection db;

    @Override
    public UserModel Login(String Username, String Password) {
        UserModel user = null;

        return user;
    }

    @Override
    public boolean Logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
