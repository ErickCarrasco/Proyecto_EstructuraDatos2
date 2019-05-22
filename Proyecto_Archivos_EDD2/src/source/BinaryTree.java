
package source;

/**
 *
 * @author Erick C
 */
public class BinaryTree <T>{
    private BinaryTreeNode<T> root;
    
    public BinaryTreeNode getRoot(){
        return root;
    }
    
    public void insert(){
        BinaryTreeNode temp = new BinaryTreeNode();
        temp = root;
        
        if (root==null) {
            BinaryTreeNode nRoot = null;
            //nRoot.setData(root);
            root = nRoot;
            
        }else{
            BinaryTreeNode leftC = new BinaryTreeNode();
            leftC = root.getLeft();
            BinaryTreeNode rightC = new BinaryTreeNode();
            rightC = root.getRigh();
            
        }
        
    }
    
    public void delete(){
        
    }
    
}
