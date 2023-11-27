package Trees;
import java.util.*;
public class userinputbstlec1 {
    static Scanner sc = null;
    public static void main(String [] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        //return root;
    }
    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data == -1)return null;
        root = new Node(data);
        System.out.println("Enter left for: "+ data);
        root.left = createTree();
        System.out.println("Enter right for: "+ data);
        root.right = createTree();
        return root;
    }
    static void inorder(Node root){                         // LNR
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void preorder(Node root){                        // NLR
        if(root == null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){                       // LRN
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
} 
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data; //this keyword says that data defined above is equal to the data in the paramaters of this funstion
    }
}
