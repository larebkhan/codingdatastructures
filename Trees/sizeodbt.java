package Trees;
import java.util.*;
public class sizeodbt {
    static Scanner sc = null;
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(sizeofbt(root));
    }
    public static Node createTree(){
        Node root = null;
        //Scanner sc = new Scanner(System.in);
        System.out.println("the data :");
        int data = sc.nextInt();
        if(data==-1)
        return null;
        root = new Node(data);
        System.out.println("enter left side for : "+ data);
        root.left=createTree();
        System.out.println("enter right side for : "+ data);
        root.right=createTree();
        return root;
        
    }
    public static int sizeofbt(Node root){
        if (root == null)
        return 0;
        return sizeofbt(root.left)+sizeofbt(root.right)+1;
    }
    public static void printlevelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            }
        }
        //using hasdmap and arraylist
        /*public void levelorder(Node root,Map<Integer,ArrayList> m, int level){
            if(root== null)
            {
                return;
            }
            if(m.containsKey(level))
            {
                ArrayList l = (ArrayList) m.get(level);
                l.add(root.data);
            }
            else
            {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(root.data);
                m.put(level,l);
            }
            
            System.out.print(root.data+ " ");
            
            levelorder(root.left,m,level+1);
            levelorder(root.right,m,level+1);
            
        }*/
    }
class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
