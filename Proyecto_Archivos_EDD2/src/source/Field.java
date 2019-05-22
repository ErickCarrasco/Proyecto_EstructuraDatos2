package source;


public class Field {
    private boolean primaryKey;
    private int type;
    private String name;
    public int size;
    
    public Field(){
        type =0;
        name = "unknown";
        size=10;
        primaryKey=false;
        
    }
    
    public Field(int type, String name, int size){
        this.type=type;
        this.name=name;
        this.size=size;
        primaryKey=false;
        
    }
    
    //Getters
    
    public boolean getPrimaryKey(){
        return primaryKey;
    }
    
    public int getType(){
        return type;
    }
    
    public int getSize(){
        return size;
    }
    
    public String getName(){
        return name;
    }
    
    //Setters
    
    public void setPrimaryKey(boolean nPrimaryKey){
        this.primaryKey = nPrimaryKey;
    }
    
    public void setType(int nType){
        this.type = nType;
        if (type==1) {
            size=1;
        }
    }
    
    public void setSize(int nSize){
        this.size = nSize;
    }
    
    public void setName(String nName){
        this.name = nName;
    }
    
    //Operator
    
    
    
}
