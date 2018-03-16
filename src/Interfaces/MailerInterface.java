/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author fernandocardoce
 */
public interface MailerInterface {
    public void SendMail(String[] recipient, String recipeName, String recipeText);
}
