/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractractions;

import models.UserModel;

/**
 *
 * @author user
 */
public abstract class absUser {

    public abstract UserModel Login(String Username, String Password);

    public abstract boolean Logout();
}
