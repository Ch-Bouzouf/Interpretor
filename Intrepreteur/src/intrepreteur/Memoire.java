
package intrepreteur;

import java.util.HashMap;

public class Memoire {
    
    
    private HashMap<Integer,String> memoire = new HashMap<>();
    
    public String getObject(int address){
        return memoire.get(address);
    }
    
    public void addObject(String object,int address){
       
        memoire.put(address, object);
       
    }
}
