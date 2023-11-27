package Trees;
import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
            this.data = data;
            this.left=null;
    }
}
public class burnatree {
    static Scanner sc = null;
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        Node root = createTree();
        int target = sc.nextInt();
        System.out.println(mintime(root,target));
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
    public static Node cmapping(Node root,int target,Map<Node,Node> m){
        //Map<Node,Node> m = new HashMap<>();
        Node res=null;
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        m.put(root,null);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data==target){
                res = curr;
            }
            if(curr.left!=null){
                m.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                m.put(curr.right,curr);
                q.add(curr.right);
            }
        }
        return res;
    }
    public static int burtree(Node root, Map<Node,Node> m){
        if(root==null){
            return 0;
        }
        HashMap<Node,Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        visited.put(root,true);
        int ans=0;
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            boolean flag=false;
            int size = q.size();
            for(int i=0;i<size;i++){
                if(curr.left!=null && !visited.getOrDefault(curr.left, false)){
                flag = true;
                q.add(curr.left);
                visited.put(curr.left,true);
                }
                if(curr.right!=null && !visited.getOrDefault(curr.right, false)){
                    flag = true;
                    q.add(curr.right);
                    visited.put(curr.right,true);
                }
                if(m.get(curr)!=null && !visited.getOrDefault(m.get(curr), false)){
                    flag = true;
                    q.add(m.get(curr));
                    visited.put(m.get(curr),true);
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
    public static  int mintime(Node root,int target){
        HashMap<Node,Node> m = new HashMap<>();
        Node targetNode = cmapping(root,target,m);
        return(burtree(targetNode, m));
    }
}
