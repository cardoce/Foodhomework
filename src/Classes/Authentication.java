/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.LoginInterface;

/**
 *
 * @author fernandocardoce
 */
public class Authentication implements LoginInterface {
    String defaultUsername = "UACA";
    String defaultPassword = "UACA123";

    @Override
    public boolean logIn(String username, String password) {
        boolean canLogin = false;
        if (username.equals(defaultUsername) && password.equals(defaultPassword)){
            canLogin = true;
        }
        return canLogin;
    }
    
}
