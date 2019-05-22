package source;

/**
 *
 * @author Erick C
 */
public class BinaryTreeNode <T> {
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private T data;
    
    public BinaryTreeNode(){
        this.left=null;
        this.right=null;
        this.data=data;
    }
    
    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, T data){
        this.left=left;
        this.right=right;
        this.data=data;
    }
    
    //Getters
    public BinaryTreeNode getLeft(){
        return left;
    }
    
    public BinaryTreeNode getRigh(){
        return right;
    }
    
    public T getData(){
        return data;
    }
    
    //Setters
    
    public void setLeft(BinaryTreeNode sLeft){
        this.left=sLeft;
    }
    
    public void setRight(BinaryTreeNode sRight){
        this.right=sRight;
    }
    
    public void setData(T sData){
        this.data= sData;
    }
    
    
    
}
