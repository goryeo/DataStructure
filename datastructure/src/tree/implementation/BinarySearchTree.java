package tree.implementation;

public class BinarySearchTree {
    public Node root;
    BinarySearchTree(){
        this.root = null;
    }
    
    public boolean find(int key){
        Node current = root;
        while(current != null){
            if(current.data == key){
                return true;
            }
            if(current.data > key){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        
        return false;
    }
    
    public void insert(int key){
        Node newNode = new Node(key);
        if(root == null){
            root = newNode;
        }
        
        Node parent = root;
        Node current = root;
        
        while(current != null){
            parent = current;
            
            if(current.data > key){
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    return;
                }
            }
            else{
                current = current.right;
                if(current == null){
                    parent.right = newNode;
                    return;
                }
            }

        }
    }
    
    public boolean delete(int key){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current.data != key){
            parent = current;
            
            if(current.data > key){
                isLeftChild = true;
                current = current.left;
            }
            else{
                isLeftChild = false;
                current = current.right;
            }
            if(current == null){
                return false;
            }
        }
        
        if(current.left == null && current.right == null){
            if(current == root){
                root = null;
            }
            
            if(isLeftChild){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        else if(current.right == null){
            if(current == root){
                root = current.left;
            }
            else if(isLeftChild){
                parent.left = current.left;
            }
            else{
                parent.right = current.left;
            }
        }
        else if(current.left == null){
            if(current == root){
                root = current.right;
            }
            else if(isLeftChild){
                parent.left = current.right;
            }
            else{
                parent.right = current.right;
            }
        }
        else if(current.left!=null && current.right!=null){
            Node successor = getSuccessor(current);
            if(current == root){
                root = successor;
            }
            else if(isLeftChild){
                parent.left = successor;
            }
            else{
                parent.right = successor;
            }
            successor.left = current.left;
        }
        
        return true;
    }
    
    public Node getSuccessor(Node deleleNode){
        Node successor = null;
        Node successorParent = null;
        Node current = deleleNode.right;
        while(current != null){
            successorParent = successor;
            successor = current;
            current = deleleNode.left;
        }
        
        if(successor != deleleNode.right){
            successorParent = successor.right;
            successor.right = deleleNode.right;
        }
        
        return successor;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
