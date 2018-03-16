/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernandocardoce
 */
public class TxtReader {
     public String txtReader(String txtFile) {
        String text ="";
        URL url = getClass().getResource(txtFile);
        File file = new File(url.getPath());
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        String st;
        try {
            while ((st = br.readLine()) != null){
                text += st;
            }
        } catch (IOException ex) {
            Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return text;
    }
    
}
