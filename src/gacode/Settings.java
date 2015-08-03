
package gacode;

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


