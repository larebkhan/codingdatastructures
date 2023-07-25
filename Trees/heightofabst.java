package Trees;
import java.util.*;
public class heightofabst {
    static Scanner sc = null;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Height of this binary tree is"+ htofbst(root));
        System.out.println("no of nodes in the bst is"+ noofnodes(root));
        System.out.println("Maximum value in a Node of this bst is" + maxofbst(root));
    }
    public static Node createTree(){
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
    public static int htofbst(Node root){
        if(root == null)return 0;
        return Math.max(htofbst(root.left),htofbst(root.right))+1;
    }
    public static int noofnodes(Node root){
        if(root == null) return 0;
        return noofnodes(root.left)+noofnodes(root.right)+1;
    }
    public static int maxofbst(Node root){
        if(root == null) return 0;
        return Math.max(root.data,Math.max(maxofbst(root.left),maxofbst(root.right)));
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
