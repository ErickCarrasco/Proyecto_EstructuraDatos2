
package source;

/**
 *
 * @author Erick C
 */

public class Key {
    private String key;
    private int index;
    
    public Key(){
        this.key="";
        this.index= -1;
    }
    
    public Key(String prKey, int prIndex){
        this.key=prKey;
        this.index=prIndex;
    }
    
    //Getters
    public String getKey(){
        return key;
    }
    
    public int getIndex(){
        return index;
    }
    
    //Setters
    
    public void setKey(String prKey){
        this.key = prKey;
    }
    
    public void setIndex(int prIndex){
        this.index = prIndex;
    }
}
