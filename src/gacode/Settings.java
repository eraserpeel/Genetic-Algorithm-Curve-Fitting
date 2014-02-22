/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gacode;

/**
 *
 * @author Blipped
 */
public class Settings {
    private static Settings instance = null; 
    public int recombineCount = 0; 
        
    protected Settings() {
        
    }
    
    public static Settings getInstance() {
        if(instance == null) {
            instance = new Settings();
        }
        return instance; 
    }
}


